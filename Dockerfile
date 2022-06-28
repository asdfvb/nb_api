##이미지 Layer를 지정하는데 사용하는 파일 형식
# 베이스 이미지 빌드하고자 하는 이미지의 기본 골격이 되는 이미지 입니다.
FROM openjdk:8-jdk-alpine
# 일종의 변수 선언. 패키징된 jar파일을 저장합니다.
ARG JAR_FILE=target/*.war
# 실행 가능한 패키징된 파일(jar)을 컨테이너 내부로 복사합니다.
COPY ${JAR_FILE} app.war
# 이미지 빌드시 실행되는 명령어 입니다.
# 로컬에서 jar파일을 구동하는 것과 동일한 명령어를 넣어주면 됩니다.
ENTRYPOINT ["java", "-war", "/app.war"]
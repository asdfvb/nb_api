package nb.nb_api.master;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//통합테스트시 필요한 어노테이션
//해당 어노테이션은 SpringBootApplication 을 찾아가 모든 빈을 스캔하여 로드함.
//그러므로 자동 빈을 주입할수 있게 되어 용이함.
//모든 빈을 등록하는 작업을 하기떄문에 무거움.
@SpringBootTest
class RegistFoodControllerTest {

    @Autowired
    private RegistFoodController registFoodController;

    @Test
    void insFoodInfo() {
        registFoodController.insFoodInfo();
    }
}
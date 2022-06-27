package nb.nb_api.master;

import ch.qos.logback.core.status.Status;
import com.google.gson.JsonObject;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/master")
public class RegistFoodController {
    @PostMapping(value = "/insFoodInfo.nb")
    public HttpStatus insFoodInfo(){
        JsonObject jsonobject = new JsonObject();

        jsonobject.addProperty("1L", "무뼈닭발");
        jsonobject.addProperty("2L", "통뼈닭발");

        jsonobject.keySet().forEach(item -> {
            System.out.println(item + " : " +jsonobject.get(item));
            System.out.println("git branch test");
        });

        return HttpStatus.OK;
    }
}

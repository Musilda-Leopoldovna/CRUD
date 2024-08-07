package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CloseController {

    @PostMapping("/closePage")
    public void handlePageClose(@RequestBody String body) {
        System.out.println("Сообщение о закрытии страницы браузера: " + body);
    }
}

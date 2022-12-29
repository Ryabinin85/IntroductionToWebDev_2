package pro.sky.introductiontowebdev2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FirstController {

    @GetMapping
    public String start() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String page() {
        FirstController controller = new FirstController();
        return String.format("Ученик: Рябинин Антон, " + "название проекта: " + controller.getClass().getTypeName()
                + ", дата создания " + LocalDateTime.now().toLocalDate() + ", " + "Тестовый запрос");
    }
}

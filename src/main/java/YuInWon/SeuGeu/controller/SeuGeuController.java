package YuInWon.SeuGeu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeuGeuController {

    @GetMapping("test")
    public String Test() {
        return "test";
    }

}

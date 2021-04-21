package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/home")
    public String index() {
        return "home";
    }
}

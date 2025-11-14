package com.example.lab10.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExploradoresController {

    @GetMapping("/exploradores")
    public String exploradores() {
        return "exploradores";
    }
}

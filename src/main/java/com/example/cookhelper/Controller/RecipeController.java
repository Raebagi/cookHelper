package com.example.cookhelper.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {
    @GetMapping("/")
    public String hello() {
        return "home";
    }


}

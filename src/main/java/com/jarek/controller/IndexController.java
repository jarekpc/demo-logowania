package com.jarek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class IndexController {

    @GetMapping("/")
    String index(Model model, Principal principal) {
        String name = principal.getName();
        model.addAttribute("name", name);
        return "index";
    }
}

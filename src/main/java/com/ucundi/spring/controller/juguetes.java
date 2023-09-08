package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class juguetes {

    @GetMapping("/juguetes")
    public String showIndex(Model model) {
        model.addAttribute("title", "juguetes");
        model.addAttribute("pathimage", "/images/instagram.png");
        return "index";
    }
}
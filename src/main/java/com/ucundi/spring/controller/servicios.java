package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class servicios {

    @GetMapping("/servicios")
    public String showIndex(Model model) {
        model.addAttribute("title", "Servicios");
        model.addAttribute("pathimage", "/images/omega.png");
        return "index";
    }
}
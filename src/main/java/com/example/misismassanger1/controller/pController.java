package com.example.misismassanger1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pController {

    @GetMapping("/dd")
    public String showPage(Model model) {
        // Здесь вы можете добавлять атрибуты в модель, если нужно
        // model.addAttribute("attributeName", "attributeValue");

        return "redirect:/p.html"; // Вернет представление p.html
    }
}

package com.example.TravelTrekk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AboutController {
    @GetMapping("/aboutpage")
    public String aboutPage() {
        return "about";
    }
}

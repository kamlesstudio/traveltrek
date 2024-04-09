package com.example.TravelTrekk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class BookingPageController {
    @GetMapping("/bookingPage")
    public String bookingPages() {
        return "bookingPage";
    }
}

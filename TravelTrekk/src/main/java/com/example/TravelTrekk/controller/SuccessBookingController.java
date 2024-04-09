package com.example.TravelTrekk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking/bookingPage")
public class SuccessBookingController {
    @GetMapping("/successBooking")
    public String bookingPage() {
        return "successBooking";
    }
}

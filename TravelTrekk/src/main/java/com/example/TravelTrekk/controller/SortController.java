package com.example.TravelTrekk.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TravelTrekk.model.AirLineModel;
import com.example.TravelTrekk.service.AirlineService;

@Controller
@RequestMapping("/")
public class SortController {
    
    @Autowired
    private AirlineService airlineService;
   

}

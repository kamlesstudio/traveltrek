package com.example.TravelTrekk.controller;

import com.example.TravelTrekk.model.AirLineModel;
import com.example.TravelTrekk.service.AirlineService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class BookPackageController {
    @Autowired
    private AirlineService airlineService;

    @GetMapping("/book-package")
    public String bookPackage(@RequestParam(required = false) String sortBy, HttpSession session, Model model) {

        List<AirLineModel> airlines = airlineService.getAllAirlines();
        // List<AirLineModel> airlines = airlineService.getAllAirlines();
        if (sortBy != null && !sortBy.isEmpty()) {
            airlines = airlines.stream()
                .filter(airline -> airline.getTitle().equalsIgnoreCase(sortBy))
                .collect(Collectors.toList());
            System.out.println(airlines);
            model.addAttribute("airlines", airlines);
        } else {
            
            airlines = airlineService.getAllAirlines();
            model.addAttribute("airlines", airlines);
           
        }
       
        // model.addAttribute("airlines", airlines);
        String from = (String) session.getAttribute("from");
        String to = (String) session.getAttribute("to");
        LocalDate departingDate = (LocalDate) session.getAttribute("departingDate");
        LocalDate returningDate = (LocalDate) session.getAttribute("returningDate");
        Integer adults = (Integer) session.getAttribute("adults");
        Integer children = (Integer) session.getAttribute("children");

        // Use the values as needed
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Departing Date: " + departingDate);
        System.out.println("Returning Date: " + returningDate);
        System.out.println("Adults: " + adults);
        System.out.println("Children: " + children);


        return "book-package";
    }

    @PostMapping("/submitform")
    public String processForm1(@RequestParam("qatar") String qatar,
                               @RequestParam("lufthansa") String lufthansa,
                               @RequestParam("adults") String adults,
                               @RequestParam("children") String children,
                               HttpSession session) {
        System.out.println("qatar" + qatar);
    return "book-package";
    }

    

    }





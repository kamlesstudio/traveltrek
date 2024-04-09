package com.example.TravelTrekk.controller;

import com.example.TravelTrekk.model.TourPackageModel;
import com.example.TravelTrekk.service.RegionService;
import com.example.TravelTrekk.service.TourPackageService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;



@Controller
@RequestMapping("/packages")
@RequiredArgsConstructor
public class TourPackageController {
    private final TourPackageService tourService;

    public static final String USER_LOGIN = "userLogin";

    @GetMapping
    public String getPackagePage(@RequestParam(required = false, name = "login") String login, @RequestParam(required = false) String email, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String from = (String) session.getAttribute("from");
        String to = (String) session.getAttribute("to");
        LocalDate departingDate = (LocalDate) session.getAttribute("departingDate");
        LocalDate returningDate =  (LocalDate)session.getAttribute("returningDate");
        int adults = (int) session.getAttribute("adults");
        int children = (int) session.getAttribute("children");
        // Use the values as needed
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Departing Date: " + departingDate);
        System.out.println("Returning Date: " + returningDate);
        System.out.println("Adults: " + adults);
        System.out.println("Children: " + children);
        if (login != null && !login.isEmpty()) {
            session.setAttribute(USER_LOGIN, login);
        }

        String userLogin = (String) session.getAttribute(USER_LOGIN);
        System.out.println("user login is :" + userLogin);
        model.addAttribute(USER_LOGIN, userLogin);

        List<TourPackageModel> packages = tourService.getAllPackagesByLogin(userLogin);
        model.addAttribute("userPackages", packages);
        return "package_page";
    }
}

package com.example.TravelTrekk.controller;

import com.example.TravelTrekk.model.Rating;
import com.example.TravelTrekk.model.RegionModel;
import com.example.TravelTrekk.model.TourPackageModel;
import com.example.TravelTrekk.service.RegionService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
@Controller
@RequestMapping("/regions")
@RequiredArgsConstructor
public class RegionController {
    private final RegionService regionService;

    public static final String USER_LOGIN = "userLogin";


    @GetMapping
    public String getRegionPage(@RequestParam(required = false, name = "login") String login, @RequestParam(required = false) String email, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (login != null && !login.isEmpty()) {
            session.setAttribute(USER_LOGIN, login);
        }

        String userLogin = (String) session.getAttribute(USER_LOGIN);
        System.out.println("user login is :" + userLogin);
        model.addAttribute(USER_LOGIN, userLogin);

        List<RegionModel> regions = regionService.getAllRegionsByLogin(userLogin);
        model.addAttribute("userRegions", regions);
        return "index";

    }
    @GetMapping("/{id}")
    public String getRegionDetails(@PathVariable int id, Model model) {
        RegionModel region = regionService.getRegionById(id);
        model.addAttribute("region", region);
        return "region_detail";
    }
    @PostMapping("/filter")
    public String filterRegions(@RequestParam String keyword, Model model) {
        List<RegionModel> filteredRegions = regionService.filterRegions(keyword);
        model.addAttribute("regions", filteredRegions);
        return "region_list";
    }

    @GetMapping("/create")
    public String getCreateRegionPage(Model model) {
        model.addAttribute("newRegion", new RegionModel());
        return "parts/create_region_page";
    }


    @PostMapping("/upload")
//    public String uploadImage(
//            @RequestParam("year") int id,
//            @RequestParam("title") String title,
//                              @RequestParam("year") int year,
//                              @RequestParam("description") String desc,
//                              @RequestParam("ratingValue") String ratingValue,
//                              @RequestParam("ratings") List<String> ratings,
//                              @RequestParam("ratings") List<TourPackageModel> pack,
//                              @RequestParam("image") MultipartFile image) {
//        // Save the image to a static location (e.g., resources/static/images)
//        System.out.println(title);
//        String imageName = title + "_" + year + ".jpg";
//
//        try {
//            Path imagePath = Paths.get("C:\\Users\\Aman\\Downloads\\TravelTrekk\\TravelTrekk\\src\\main\\resources\\static\\images\\" + imageName);
//            Files.write(imagePath, image.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "error";
//        }
////        RegionModel region = regionService.findRegionByTitle(title);
////        System.out.println("region" + region);
//        Rating rating = new Rating(title, ratingValue);
////        region.getRatings().add(rating.getRatingValue());
//        regionService.save(new RegionModel(id,title, year, imageName,desc, ratings,pack));
//
//        return "redirect:/regions";
    public String processForm1(@RequestParam String from,
                               @RequestParam String to,
                               @RequestParam ("departingDate") @DateTimeFormat(pattern = "MM/dd/yyyy")  LocalDate departingDate,
                               @RequestParam ("returningDate") @DateTimeFormat(pattern = "MM/dd/yyyy")  LocalDate returningDate,
                               @RequestParam int adults,
                               @RequestParam int children,
                               HttpSession session) {
        // Store form data in session
        session.setAttribute("from", from);
        session.setAttribute("to", to);
        session.setAttribute("departingDate", departingDate);
        session.setAttribute("returningDate", returningDate);
        session.setAttribute("adults", adults);
        session.setAttribute("children", children);
//        session.setAttribute("cabin", cabin);

        return "redirect:/book-package";
    }
}
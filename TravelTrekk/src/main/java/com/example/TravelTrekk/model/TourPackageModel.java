package com.example.TravelTrekk.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TourPackageModel {
    private int id;
    private String title;
    private double price;
    private int numberOfDays;
    private List<String> sitesToVisit;
    private List<String> activities;
    private String description;

    public TourPackageModel(int id, String title, double price, int numberOfDays, List<String> sitesToVisit, List<String> activities, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.numberOfDays = numberOfDays;
        this.sitesToVisit = sitesToVisit;
        this.activities = activities;
        this.description = description;
    }

    // Getters and setters
}


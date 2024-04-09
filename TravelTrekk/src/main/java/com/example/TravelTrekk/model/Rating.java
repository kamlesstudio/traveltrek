package com.example.TravelTrekk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String region;


    private String ratingValue;

    public Rating(String ratingValue) {
        this.ratingValue = ratingValue;
    }


    // Constructor, getters, and setters
}
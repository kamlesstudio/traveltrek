package com.example.TravelTrekk.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RegionModel {
    private String title;
    private int days;
    private String image;
    private String description;
    private List<String> ratings;
    private int id;
    private List<TourPackageModel> tourPackages;



    public RegionModel(int id,String title, int days, String image, String description, List<String> ratings,List<TourPackageModel> tourPackages) {
        this.title = title;
        this.days = days;
        this.image = image;
        this.description = description;
        this.ratings = ratings;
        this.id = id;
        this.tourPackages = tourPackages;
    }

    public double getAverageRating() {
            if (ratings == null || ratings.isEmpty()) {
                return 0.0;
            }

            int sum = 0;
            for (String rating : ratings) {
                switch (rating) {
                    case "good":
                        sum += 5; // Assigning a value of 5 for "good" rating
                        break;
                    case "average":
                        sum += 3; // Assigning a value of 3 for "average" rating
                        break;
                    case "bad":
                        sum += 1; // Assigning a value of 1 for "bad" rating
                        break;
                    default:
                        // Ignore unknown ratings
                        break;
                }
            }

            return (double) sum / ratings.size();
        }
    }


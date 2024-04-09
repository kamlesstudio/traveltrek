package com.example.TravelTrekk.service;


import com.example.TravelTrekk.model.AirLineModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class AirlineService {

    public List<AirLineModel> getAllAirlines() {
        List<AirLineModel> airlines = new ArrayList<>();
        airlines.add(new AirLineModel("Qatar", 100.0, "qatar1.jpg", "Bahamas", "Alaska"));
        airlines.add(new AirLineModel("Qatar", 150.0, "qatar2.jpg", "Alaska", "Bahamas"));
        airlines.add(new AirLineModel("Air Berlin", 200.0, "airberlin1.jpg", "Bahamas", "Alaska"));
        airlines.add(new AirLineModel("Air Berlin", 250.0, "airberlin2.jpg", "Alaska", "Bahamas"));
        airlines.add(new AirLineModel("Lufthansa", 400.0, "lufthansa1.jpg", "Bahamas", "Alaska"));
        airlines.add(new AirLineModel("Lufthansa", 500.0, "lufthansa2.jpg", "Alaska", "Bahamas"));
        airlines.add(new AirLineModel("United", 550.0, "united1.jpg", "Bahamas", "Alaska"));
        airlines.add(new AirLineModel("United", 300.0, "united2.jpg", "Alaska", "Bahamas"));
        airlines.add(new AirLineModel("United", 350.0, "united3.jpg", "Alaska", "Bahamas"));
        return airlines;
    }

    public List<AirLineModel> getAirlinesBySort(String sortBy){
        List<AirLineModel> airlines = getAllAirlines();

        // Sort the airlines based on the selected sorting criteria
        switch (sortBy) {
            case "title":
                airlines.sort(Comparator.comparing(AirLineModel::getTitle,String.CASE_INSENSITIVE_ORDER));
                break;
            case "price":
                airlines.sort(Comparator.comparing(AirLineModel::getPrice));
                break;
            // Add more cases for other sorting criteria if needed
            default:
                // Default sorting, no need to do anything
                break;
        }

        return airlines;
    };
}
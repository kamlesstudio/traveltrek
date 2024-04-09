package com.example.TravelTrekk.service;


import com.example.TravelTrekk.model.TourPackageModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TourPackageService {
    private static List<TourPackageModel> packages;
    static {
        packages = new ArrayList<>();
        packages.add(new TourPackageModel(1, "Tour to Paris", 1500.0, 3, Arrays.asList("Eiffel Tower", "Louvre Museum", "Notre Dame Cathedral"), Arrays.asList("Sightseeing", "Shopping","Dining"), "Explore the beautiful city of Paris with its iconic landmarks and rich history"));
        packages.add(new TourPackageModel(2, "Safari Adventure in Africa", 3500.0, 5, Arrays.asList("Serengeti National Park", "Maasai Mara National Reserve","Victoria Falls"), Arrays.asList("Safar", "Wildlife Watching","Cultural Experiences"), "Embark on a thrilling safari adventure in Africa, witnessing the breathtaking wildlife and natural wonders."));
        packages.add(new TourPackageModel(3, "Island Getaway in Maldives", 2500.0, 7, Arrays.asList("Male", "Baa Atoll","Ari Atoll"), Arrays.asList("Snorkeling", "Scuba Diving","Relaxing on the Beach"), "Relax and unwind in the pristine beaches of Maldives, surrounded by crystal-clear waters and luxurious resorts."));
        packages.add(new TourPackageModel(4, "Cultural Tour of Japan", 1800.0, 10, Arrays.asList("Tokyo", "Kyoto","Hiroshima"), Arrays.asList("Visiting Temples", "Tea Ceremony,","Traditional Japanese Cuisine"), "Immerse yourself in the rich culture and traditions of Japan, from bustling cities to serene temples."));
        packages.add(new TourPackageModel(5, "Adventure Trek in Nepal", 2500.0, 10, Arrays.asList("Everest Base Camp", "Annapurna Circuit","Pokhara"), Arrays.asList("Trekking", "Mountain Views","Cultural Experiences"), "Trek through the Himalayas of Nepal, experiencing breathtaking views and authentic Nepalese culture."));
        packages.add(new TourPackageModel(6, "Wine Tour in Italy", 1600.0, 5, Arrays.asList("Tuscany", "Piedmont","Sicily"), Arrays.asList("Wine Tasting", "Vineyard Tours","Italian Cuisine"), "Indulge in the finest wines of Italy, exploring picturesque vineyards and charming wine towns."));
        packages.add(new TourPackageModel(7, "Beach Vacation in Hawaii", 2800.0, 8, Arrays.asList("Maui,", "Oahu","Kauai"), Arrays.asList("Surfing", "Snorkeling","Luau"), "Relax on the beautiful beaches of Hawaii, surrounded by stunning scenery and tropical vibes."));
        packages.add(new TourPackageModel(8, "Adventure Tour of Iceland", 2500.0, 9, Arrays.asList("Golden Circle", " Blue Lagoon","Vatnajokull National Park"), Arrays.asList("Glacier Hiking", "Northern Lights Viewing","Geothermal Spa"), "Explore the otherworldly landscapes of Iceland, from glaciers to geysers, and witness the natural wonders of this unique destination."));
        packages.add(new TourPackageModel(9, "Romantic Getaway in Santorini", 3200.0, 7, Arrays.asList("Oia", "Fira","Red Beach"), Arrays.asList("Sunset Cruises", "Wine Tasting","Relaxing on Cliffside Villas"), "Experience the romance of Santorini, with its stunning sunsets, whitewashed buildings, and breathtaking views of the Aegean Sea."));
        packages.add(new TourPackageModel(10, "Cultural Tour of Peru",  2300.0, 8, Arrays.asList("Machu Picchu", "Cusco","Sacred Valley"), Arrays.asList("Inca Ruins Exploration", "Peruvian Cuisine","Andean Cultural Experiences"), "Journey through the ancient ruins of Peru, exploring its rich history and cultural heritage."));
        packages.add(new TourPackageModel(11, "Wildlife Safari in India", 2100.0, 6, Arrays.asList("Jim Corbett National Park", "Ranthambore National Park","Kaziranga National Park"), Arrays.asList("Wildlife Safaris", "Tiger Spotting","Bird Watching"), "Discover the incredible wildlife of India, home to a diverse range of species including tigers, elephants, and rhinoceros."));
        packages.add(new TourPackageModel(12, "Adventure Tour of Iceland", 3250.0, 9, Arrays.asList("Barcelona", "Madrid","Seville"), Arrays.asList("Flamenco Show", "apas Tasting","Visiting Gaudi's Architecture"), "Immerse yourself in the vibrant culture of Spain, from its lively cities to its rich history and traditions."));
        packages.add(new TourPackageModel(13, "Road Trip across Australia", 2400.0, 10, Arrays.asList("Great Barrier Reef", "Sydney","Uluru"), Arrays.asList("Driving along the Coast", "Desert Safari","Wildlife Watching"), "Embark on an epic road trip across Australia, exploring its diverse landscapes and iconic landmarks."));
        packages.add(new TourPackageModel(14, "City Break in New York", 1200.0, 4, Arrays.asList("Statue of Liberty,", "Central Park","Times Square"), Arrays.asList("Sightseeing", "Broadway Show","Wildlife","Shopping"), "Explore the bustling streets of New York City, from iconic landmarks to world-class entertainment."));
    }
    public List<TourPackageModel> getAllPackagesByLogin(String login) {
        if (login != null) {
            return packages;
        }

            return packages.stream()
                    .filter(pacakage -> pacakage.getTitle().equals("Package 1"))
                    .toList();
        }

}

package com.example.TravelTrekk.service;

import com.example.TravelTrekk.model.RegionModel;
import com.example.TravelTrekk.model.TourPackageModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegionService {
    private static List<RegionModel> regions;
    static {

        TourPackageModel package1 = new TourPackageModel(1, "Package 1", 100.0, 3, Arrays.asList("Site 1", "Site 2"), Arrays.asList("Activity 1", "Activity 2"), "Description 1");
        TourPackageModel package2 = new TourPackageModel(1, "Tour to Paris", 1500.0, 3, Arrays.asList("Eiffel Tower", "Louvre Museum", "Notre Dame Cathedral"), Arrays.asList("Sightseeing", "Shopping","Dining"), "Explore the beautiful city of Paris with its iconic landmarks and rich history");
        TourPackageModel package3 = new TourPackageModel(2, "Safari Adventure in Africa", 3500.0, 5, Arrays.asList("Serengeti National Park", "Maasai Mara National Reserve","Victoria Falls"), Arrays.asList("Safar", "Wildlife Watching","Cultural Experiences"), "Embark on a thrilling safari adventure in Africa, witnessing the breathtaking wildlife and natural wonders.");
        TourPackageModel package4 = new TourPackageModel(3, "Island Getaway in Maldives", 2500.0, 7, Arrays.asList("Male", "Baa Atoll","Ari Atoll"), Arrays.asList("Snorkeling", "Scuba Diving","Relaxing on the Beach"), "Relax and unwind in the pristine beaches of Maldives, surrounded by crystal-clear waters and luxurious resorts.");
        TourPackageModel package5 = new TourPackageModel(4, "Cultural Tour of Japan", 1800.0, 10, Arrays.asList("Tokyo", "Kyoto","Hiroshima"), Arrays.asList("Visiting Temples", "Tea Ceremony,","Traditional Japanese Cuisine"), "Immerse yourself in the rich culture and traditions of Japan, from bustling cities to serene temples.");
        TourPackageModel package6 = new TourPackageModel(5, "Adventure Trek in Nepal", 2500.0, 10, Arrays.asList("Everest Base Camp", "Annapurna Circuit","Pokhara"), Arrays.asList("Trekking", "Mountain Views","Cultural Experiences"), "Trek through the Himalayas of Nepal, experiencing breathtaking views and authentic Nepalese culture.");
        TourPackageModel package7 = new TourPackageModel(6, "Wine Tour in Italy", 1600.0, 5, Arrays.asList("Tuscany", "Piedmont","Sicily"), Arrays.asList("Wine Tasting", "Vineyard Tours","Italian Cuisine"), "Indulge in the finest wines of Italy, exploring picturesque vineyards and charming wine towns.");
        TourPackageModel package8 = new TourPackageModel(7, "Beach Vacation in Hawaii", 2800.0, 8, Arrays.asList("Maui,", "Oahu","Kauai"), Arrays.asList("Surfing", "Snorkeling","Luau"), "Relax on the beautiful beaches of Hawaii, surrounded by stunning scenery and tropical vibes.");
        TourPackageModel package9 = new TourPackageModel(8, "Adventure Tour of Iceland", 2500.0, 9, Arrays.asList("Golden Circle", " Blue Lagoon","Vatnajokull National Park"), Arrays.asList("Glacier Hiking", "Northern Lights Viewing","Geothermal Spa"), "Explore the otherworldly landscapes of Iceland, from glaciers to geysers, and witness the natural wonders of this unique destination.");
        TourPackageModel package10 = new TourPackageModel(9, "Romantic Getaway in Santorini", 3200.0, 7, Arrays.asList("Oia", "Fira","Red Beach"), Arrays.asList("Sunset Cruises", "Wine Tasting","Relaxing on Cliffside Villas"), "Experience the romance of Santorini, with its stunning sunsets, whitewashed buildings, and breathtaking views of the Aegean Sea.");
        TourPackageModel package11 = new TourPackageModel(10, "Cultural Tour of Peru",  2300.0, 8, Arrays.asList("Machu Picchu", "Cusco","Sacred Valley"), Arrays.asList("Inca Ruins Exploration", "Peruvian Cuisine","Andean Cultural Experiences"), "Journey through the ancient ruins of Peru, exploring its rich history and cultural heritage.");
        TourPackageModel package12 = new TourPackageModel(11, "Wildlife Safari in India", 2100.0, 6, Arrays.asList("Jim Corbett National Park", "Ranthambore National Park","Kaziranga National Park"), Arrays.asList("Wildlife Safaris", "Tiger Spotting","Bird Watching"), "Discover the incredible wildlife of India, home to a diverse range of species including tigers, elephants, and rhinoceros.");
        TourPackageModel package13 = new TourPackageModel(12, "Adventure Tour of Iceland", 3250.0, 9, Arrays.asList("Barcelona", "Madrid","Seville"), Arrays.asList("Flamenco Show", "apas Tasting","Visiting Gaudi's Architecture"), "Immerse yourself in the vibrant culture of Spain, from its lively cities to its rich history and traditions.");
        TourPackageModel package14 = new TourPackageModel(13, "Road Trip across Australia", 2400.0, 10, Arrays.asList("Great Barrier Reef", "Sydney","Uluru"), Arrays.asList("Driving along the Coast", "Desert Safari","Wildlife Watching"), "Embark on an epic road trip across Australia, exploring its diverse landscapes and iconic landmarks.");
        TourPackageModel package15 = new TourPackageModel(14, "City Break in New York", 1200.0, 4, Arrays.asList("Statue of Liberty,", "Central Park","Times Square"), Arrays.asList("Sightseeing", "Broadway Show","Wildlife","Shopping"), "Explore the bustling streets of New York City, from iconic landmarks to world-class entertainment.");
        regions = new ArrayList<>();
        regions.add(new RegionModel(1,"Bahamas", 1925,"popular01.jpg","good", Arrays.asList("good", "good", "bad"),Arrays.asList(package1)));
        regions.add(new RegionModel(2,"Greece", 1960,"popular03.jpg","good",Arrays.asList("good", "good", "good"),Arrays.asList(package2)));
        regions.add(new RegionModel(3,"Mediterranean", 1949,"popular02.jpg","good",Arrays.asList("bad", "bad", "bad"),Arrays.asList(package3)));
        regions.add(new RegionModel(4,"The Catcher in the Rye", 1951,"4.webp","good",Arrays.asList("good", "average", "good"),Arrays.asList(package4)));
        regions.add(new RegionModel(5,"The Great Gatsby", 1925,"5.webp","good", Arrays.asList("good", "good", "bad"),Arrays.asList(package5)));
        regions.add(new RegionModel(6,"To Kill a Mockingbird", 1960,"6.webp","good",Arrays.asList("good", "good", "good"),Arrays.asList(package6)));
        regions.add(new RegionModel(7,"1984", 1949,"7.webp","good",Arrays.asList("bad", "bad", "bad"),Arrays.asList(package7)));
        regions.add(new RegionModel(8,"The Catcher in the Rye", 1951,"8.webp","good",Arrays.asList("good", "average", "good"),Arrays.asList(package8)));
        regions.add(new RegionModel(9,"The Great Gatsby", 1925,"9.webp","good", Arrays.asList("good", "good", "bad"),Arrays.asList(package9)));
        regions.add(new RegionModel(10,"To Kill a Mockingbird", 1960,"10.webp","good",Arrays.asList("good", "good", "good"),Arrays.asList(package10)));
        regions.add(new RegionModel(11,"1984", 1949,"11.webp","good",Arrays.asList("bad", "bad", "bad"),Arrays.asList(package11)));
        regions.add(new RegionModel(12,"The Catcher in the Rye", 1951,"12.webp","good",Arrays.asList("good", "average", "good"),Arrays.asList(package12)));
        regions.add(new RegionModel(13,"The Great Gatsby", 1925,"13.webp","good", Arrays.asList("good", "good", "bad"),Arrays.asList(package13)));
        regions.add(new RegionModel(14,"To Kill a Mockingbird", 1960,"14.webp","good",Arrays.asList("good", "good", "good"),Arrays.asList(package14)));

    }
    public List<RegionModel> getAllRegionsByLogin(String login) {
        if (login != null) {
            return regions;
        }

        return regions.stream()
                .filter(book -> book.getDays() > 1951)
                .toList();
    }
    public void save(RegionModel region) {
        regions.add(region);
    }


    public RegionModel findRegionByTitle(String title) {
        return regions.stream()
                .filter(region -> region.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public RegionModel getRegionById(int id) {
        for (RegionModel region : regions) {
            if (region.getId() == id) {
                return region;
            }
        }
        return null; // Return null if region with given id is not found

    }
    public List<RegionModel> filterRegions(String keyword) {
        return regions.stream()
                .filter(region -> region.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}

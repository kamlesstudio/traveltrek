package com.example.TravelTrekk.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AirLineModel {

    // Getters and setters
    private String title;
        private double price;
        private String image;
        private String to;
        private String from;
        public AirLineModel(String title, double price, String image, String to, String from) {
            this.title = title;
            this.price = price;
            this.image = image;
            this.to = to;
            this.from = from;
        }
        public String getTitle() {
            
            return title;
        }

     public void setTitle(String title) {
           this.title = title;
        }

    public void setPrice(double price) {
            this.price = price;
        }

    public void setImage(String image) {
            this.image = image;
        }

    public void setTo(String to) {
            this.to = to;
        }

    public void setFrom(String from) {
            this.from = from;
        }
    public String getToFrom() {
        return to + "-" + from;
    }
    }



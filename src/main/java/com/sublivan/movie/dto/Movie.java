package com.sublivan.movie.dto;

import java.awt.*;

public class Movie {

    private int id;
    private String title;
    private int price;
//    private Image poster;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


//    public Image getPoster() {
//        return poster;
//    }
}
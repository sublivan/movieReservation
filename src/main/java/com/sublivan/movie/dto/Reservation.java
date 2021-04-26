package com.sublivan.movie.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class Reservation {
    private int id;
    private String seatNumber;
    private int totalPrice;
    private String phoneNumber;
    private int scheduleId;
    private String movieTitle;
    private String screenRoom;

    private Schedule schedule;

    @Builder
    public Reservation(int id, String seatNumber, int totalPrice, String phoneNumber, int scheduleId, String movieTitle, String screenRoom) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.totalPrice = totalPrice;
        this.phoneNumber = phoneNumber;
        this.scheduleId = scheduleId;
        this.movieTitle = movieTitle;
        this.screenRoom = screenRoom;
    }
}

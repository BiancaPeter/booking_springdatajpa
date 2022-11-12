package com.spring.booking.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class AddReservationDTO {

    private Long userId;

    private List<Long> roomIds;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;


    public AddReservationDTO(Long userId, List<Long> roomIds, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.userId = userId;
        this.roomIds = roomIds;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<Long> roomIds) {
        this.roomIds = roomIds;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
}
package com.busReservation.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BusDto {
    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;
}


package com.busReservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.RouteMatcher;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;


}

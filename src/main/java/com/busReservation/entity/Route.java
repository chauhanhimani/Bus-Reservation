package com.busReservation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;

    private String fromLocation;
    private String toLocation;
    private String fromDate;
    private String toDate;
    private String totalDuration;
    private String fromTime;
    private String toTime;

    @Column(name="bus_id", unique=true, nullable = false)
    private long busId;


}
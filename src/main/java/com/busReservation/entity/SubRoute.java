package com.busReservation.entity;import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subRouteId;

    private String fromLocation;
    private String toLocation;
    private String fromDate;
    private String toDate;
    private String totalDuration;
    private String fromTime;
    private String toTime;
    @Column(name = "route_id",nullable = false)
    private long routeId;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}
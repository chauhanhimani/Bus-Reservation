package com.busReservation.service;

import com.busReservation.entity.Bus;
import com.busReservation.entity.Route;
import com.busReservation.exception.ResourceNotFoundException;
import com.busReservation.repository.BusRepository;
import com.busReservation.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private BusRepository busRepository;

    public Route createRoute(long busId, Route route){
        Bus bus=  busRepository.findById(busId).orElseThrow(
                ()-> new ResourceNotFoundException("Bus not added!!...")
        );

        Route r= routeRepository.findByBusId(route.getBusId());

        if(r!=null){
            throw new ResourceNotFoundException("Route was already added!!...");
        }

        if(r==null){
            routeRepository.save(route);
            return route;
        }
        return null;
  }
}
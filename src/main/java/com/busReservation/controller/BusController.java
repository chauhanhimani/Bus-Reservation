
package com.busReservation.controller;
import com.busReservation.entity.Bus;
import com.busReservation.payload.BusDto;
import com.busReservation.repository.BusRepository;
import com.busReservation.repository.RouteRepository;
import com.busReservation.service.BusService;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

        @Autowired
        private EntityManagerFactory entityManagerFactory;

        @Autowired
        private BusService busService;

        @Autowired
        private RouteRepository routeRepository;

        @Autowired
        private BusRepository busRepository;

        // http://localhost:8080/api/v1/bus/add
        @PostMapping("/add")
        public ResponseEntity<Bus> addBus(@RequestBody BusDto busDto) throws ParseException {

            Bus bus=  busService.addBus(busDto);
            return  new ResponseEntity<>(bus, HttpStatus.CREATED);

 }

    }
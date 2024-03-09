package com.busReservation.service;
import com.busReservation.entity.Bus;
import com.busReservation.entity.Route;
import com.busReservation.entity.SubRoute;
import com.busReservation.payload.BusDto;
import com.busReservation.payload.SubRouteDto;
import com.busReservation.repository.BusRepository;
import com.busReservation.repository.RouteRepository;
import com.busReservation.repository.SubRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public Bus  addBus(BusDto busDto) {

        Bus bus = new Bus();
        bus.setBusNumber(busDto.getBusNumber());
        bus.setBusType(busDto.getBusType());
        bus.setPrice(busDto.getPrice());
        bus.setTotalSeats(busDto.getTotalSeats());
        bus.setAvailableSeats(busDto.getAvailableSeats());


        Bus savedBus= busRepository.save(bus);

        return savedBus;

   }
}
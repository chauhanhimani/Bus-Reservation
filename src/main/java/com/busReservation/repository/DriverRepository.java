package com.busReservation.repository;

import com.busReservation.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {

}

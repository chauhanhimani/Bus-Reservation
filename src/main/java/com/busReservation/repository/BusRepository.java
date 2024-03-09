package com.busReservation.repository;

import com.busReservation.entity.Bus;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
}

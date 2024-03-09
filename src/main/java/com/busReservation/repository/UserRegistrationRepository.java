package com.busReservation.repository;

import com.busReservation.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Long> {

}

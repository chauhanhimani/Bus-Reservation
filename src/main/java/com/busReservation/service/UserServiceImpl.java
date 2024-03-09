package com.busReservation.service;


import com.busReservation.entity.UserRegistration;
import com.busReservation.payload.UserRegistrationDto;
import com.busReservation.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRegistrationRepository userRegistrationRepository;
    public UserRegistrationDto createUser ( UserRegistration userRegistration){
        userRegistrationRepository.save(userRegistration);
        return null;
    }

    public UserRegistration getUserById(long id) {
      return  userRegistrationRepository.findById(id).get();
    }
}

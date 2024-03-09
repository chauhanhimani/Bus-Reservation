package com.busReservation.controller;

import com.busReservation.entity.UserRegistration;
import com.busReservation.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/user")
public class UserRegistrationController {
    @Autowired
    private UserServiceImpl userService;
    @PostMapping
    //@CrossOrigin
    public String createUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("profilePicture") MultipartFile profilePicture

    ){
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.setName(name);
            userRegistration.setEmail(email);
            userRegistration.setPassword(password);
            userRegistration.setPofilePicture(profilePicture.getBytes());
            userService.createUser(userRegistration);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "done..";
    }
@GetMapping("/{id}")
//@CrossOrigin
    public ResponseEntity<UserRegistration> getuserById(@PathVariable Long id){
       UserRegistration userRegistration =  userService.getUserById(id);
       return new ResponseEntity<>(userRegistration, HttpStatus.OK);

    }

}

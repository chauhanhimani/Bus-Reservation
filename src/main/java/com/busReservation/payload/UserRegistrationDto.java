package com.busReservation.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;

public class UserRegistrationDto {
    private long id;
    private String name;
    private String email;
    private String password;
    private byte[] pofilePicture;
}

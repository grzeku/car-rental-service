package com.pl.carrentalservice.clients;


import com.pl.carrentalservice.reservation.Reservation;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CreateClientRequest {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private List<Reservation> reservations;
    private String role;
    private String password;
}

package com.pl.carrentalservice.renting;

import lombok.Data;
import org.springframework.stereotype.Component;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.clients.Client;

import javax.persistence.Entity;

@Entity
@Data
@Component
public class Rent {

    private Integer id;

    private String dateOfReservation;
    private String datePickUp;
    private String dateReturn;
    private Car car;
    private Client client;
    private String branchStart;
    private String branchEnd;
    private Integer pricePerDay;


    public Rent(String dateOfReservation, String datePickUp, String dateReturn, Car car, Client client, String branchStart, String branchEnd, Integer pricePerDay) {
        this.dateOfReservation = dateOfReservation;
        this.datePickUp = datePickUp;
        this.dateReturn = dateReturn;
        this.car = car;
        this.client = client;
        this.branchStart = branchStart;
        this.branchEnd = branchEnd;
        this.pricePerDay = pricePerDay;
    }

    private String date;


}

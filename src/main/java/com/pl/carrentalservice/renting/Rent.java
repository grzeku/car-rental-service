//package com.pl.carrentalservice.renting;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Component;
//import com.pl.carrentalservice.cars.Car;
//import com.pl.carrentalservice.clients.Client;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//@Data
//@Component
//@NoArgsConstructor
//@AllArgsConstructor
//public class Rent {
//@Id
//@GeneratedValue
//    private Integer id;
//
//    private String dateOfReservation;
//    private String datePickUp;
//    private String dateReturn;
//    private Car car;
//    private Client client;
//    private String branchStart;
//    private String branchEnd;
//    private Integer pricePerDay;
//
//
//    public Rent(String dateOfReservation, String datePickUp, String dateReturn, Car car, Client client, String branchStart, String branchEnd, Integer pricePerDay) {
//        this.dateOfReservation = dateOfReservation;
//        this.datePickUp = datePickUp;
//        this.dateReturn = dateReturn;
//        this.car = car;
//        this.client = client;
//        this.branchStart = branchStart;
//        this.branchEnd = branchEnd;
//        this.pricePerDay = pricePerDay;
//    }
//
//    private String date;
//
//
//}

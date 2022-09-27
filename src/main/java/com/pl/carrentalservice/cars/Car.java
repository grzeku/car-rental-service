//package com.pl.carrentalservice.cars;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Cars")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Car {
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String make;
//    private String model;
//    //TODO enum here
//    private BodyStyle bodyStyle ;
//    private Integer productionYear;
//    private Integer mileage;
//    private CarAvailabilityStatus carAvailabilityStatus;
//    private Integer price;
//
//
//    public Car(String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price) {
//        this.make = make;
//        this.model = model;
//        this.bodyStyle = bodyStyle;
//        this.productionYear = productionYear;
//        this.mileage = mileage;
//        this.carAvailabilityStatus = carAvailabilityStatus;
//        this.price = price;
//    }
//}
//

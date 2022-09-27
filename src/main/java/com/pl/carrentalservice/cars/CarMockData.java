//package com.pl.carrentalservice.cars;
//
//import lombok.Data;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//@Data
//public class CarMockData {
//    List<Car>cars;
//
//    @PostConstruct
//    public  List<Car> initiateCarData() {
//        return List.of(
//
//                new Car("Audi", "A4", BodyStyle.SEDAN, 1994, 200000, CarAvailabilityStatus.AVAILABLE, 39),
//                new Car("Audi", "A4", BodyStyle.SEDAN, 1995, 210000, CarAvailabilityStatus.AVAILABLE, 39),
//                new Car("Audi", "A4", BodyStyle.TOURING, 1992, 202000, CarAvailabilityStatus.AVAILABLE, 39),
//                new Car("Audi", "A4", BodyStyle.SEDAN, 1991, 200300, CarAvailabilityStatus.AVAILABLE, 39),
//                new Car("Audi", "A4", BodyStyle.TOURING, 2012, 200040, CarAvailabilityStatus.AVAILABLE, 59),
//                new Car("BMW", "M4", BodyStyle.COUPE, 2021, 200040, CarAvailabilityStatus.RENTED, 159),
//                new Car("Bentley", "Continental GT", BodyStyle.COUPE, 2012, 91040, CarAvailabilityStatus.UNAVAILABLE, 259),
//                new Car("Ferrari", "California", BodyStyle.COUPE, 2017, 24040, CarAvailabilityStatus.RENTED, 259),
//                new Car("Lamborghini", "Huracan", BodyStyle.COUPE, 2021, 10020, CarAvailabilityStatus.AVAILABLE, 259),
//                new Car("Fiat", "500", BodyStyle.COMPACT, 2022, 12040, CarAvailabilityStatus.AVAILABLE, 49));
//    }
//    public Integer getCarPrice( int index){
//         Car car = cars.get(index);
//        return car.getPrice();
//
//    }
//
//
//}
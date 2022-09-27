package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.clients.Client;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Data
@Component
@RequiredArgsConstructor
public class CarMockData {
    private final CarService service;
    public List<Car>cars = new ArrayList<>();

    @PostConstruct
    public  void initiateCarData() {
        List<Car>cars = List.of(


                new Car(1L,"Audi", "A4", BodyStyle.SEDAN, 1994, 200000, CarAvailabilityStatus.AVAILABLE, 39),
                new Car(2L,"Audi", "A4", BodyStyle.SEDAN, 1995, 210000, CarAvailabilityStatus.AVAILABLE, 39),
                new Car(3L,"Audi", "A4", BodyStyle.TOURING, 1992, 202000, CarAvailabilityStatus.AVAILABLE, 39),
                new Car(4L,"Audi", "A4", BodyStyle.SEDAN, 1991, 200300, CarAvailabilityStatus.AVAILABLE, 39),
                new Car(5L,"Audi", "A4", BodyStyle.TOURING, 2012, 200040, CarAvailabilityStatus.AVAILABLE, 59),
                new Car(6L,"BMW", "M4", BodyStyle.COUPE, 2021, 200040, CarAvailabilityStatus.RENTED, 159),
                new Car(7L,"Bentley", "Continental GT", BodyStyle.COUPE, 2012, 91040, CarAvailabilityStatus.UNAVAILABLE, 259),
                new Car(8L,"Ferrari", "California", BodyStyle.COUPE, 2017, 24040, CarAvailabilityStatus.RENTED, 259),
                new Car(9L,"Lamborghini", "Huracan", BodyStyle.COUPE, 2021, 10020, CarAvailabilityStatus.AVAILABLE, 259),
                new Car(10L,"Fiat", "500", BodyStyle.COMPACT, 2022, 12040, CarAvailabilityStatus.AVAILABLE, 49));
        service.saveCars(cars);
    }
    public Integer getCarPrice( int index){
         Car car = cars.get(index);
        return car.getPrice();

    }
    public void add(Car car){
        cars.add(car);
    }

    public List<Car> getAll() { return cars;}
}
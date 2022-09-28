package com.pl.carrentalservice.cars;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CarMockData {
    private final CarService service;
    public List<Car>cars = new ArrayList<>();

    @PostConstruct
    public  void initiateCarData() {
        List<Car>cars = List.of(


                 createCar(1,"Audi", "A4", BodyStyle.SEDAN, 1994, 200000, CarAvailabilityStatus.AVAILABLE, 39),
                 createCar(1,"Audi", "A4", BodyStyle.SEDAN, 1995, 210000, CarAvailabilityStatus.AVAILABLE, 39),
                 createCar(1,"Audi", "A4", BodyStyle.TOURING, 1992, 202000, CarAvailabilityStatus.AVAILABLE, 39),
                 createCar(1,"Audi", "A4", BodyStyle.SEDAN, 1991, 200300, CarAvailabilityStatus.AVAILABLE, 39),
                 createCar(1,"Audi", "A4", BodyStyle.TOURING, 2012, 200040, CarAvailabilityStatus.AVAILABLE, 59),
                 createCar(1,"BMW", "M4", BodyStyle.COUPE, 2021, 200040, CarAvailabilityStatus.RENTED, 159),
                 createCar(1,"Bentley", "Continental GT", BodyStyle.COUPE, 2012, 91040, CarAvailabilityStatus.UNAVAILABLE, 259),
                 createCar(1,"Ferrari", "California", BodyStyle.COUPE, 2017, 24040, CarAvailabilityStatus.RENTED, 259),
                 createCar(1,"Lamborghini", "Huracan", BodyStyle.COUPE, 2021, 10020, CarAvailabilityStatus.AVAILABLE, 259),
                 createCar(1,"Fiat", "500", BodyStyle.COMPACT, 2022, 12040, CarAvailabilityStatus.AVAILABLE, 49));
        service.saveCars(cars);
    }
    private Car createCar(Integer id,String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price) {
        return new Car()
                .setMake(make)
                .setModel(model)
                .setBodyStyle(bodyStyle)
                .setProductionYear(productionYear)
                .setMileage(mileage)
                .setCarAvailabilityStatus(carAvailabilityStatus)
                .setPrice(price);
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
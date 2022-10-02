package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.util.HibernateUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CarMockData {
    final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    final EntityManager entityManager = sessionFactory.createEntityManager();
    private final CarService service;
    public List<Car>cars = new ArrayList<>();


    private Car createCar(String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price) {
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


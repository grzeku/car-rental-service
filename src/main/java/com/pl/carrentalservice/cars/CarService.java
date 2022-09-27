package com.pl.carrentalservice.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository repository;
    public List<Car> getAll() { return repository.findAll();}

    public void addCars(List <Car> cars) { repository.saveAll(cars);}

    public void saveCars(List<Car> cars) {
        repository.saveAll(cars);
    }
}

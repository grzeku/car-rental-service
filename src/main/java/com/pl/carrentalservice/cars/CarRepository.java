package com.pl.carrentalservice.cars;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CarRepository extends JpaRepository<Car, Long> {
}

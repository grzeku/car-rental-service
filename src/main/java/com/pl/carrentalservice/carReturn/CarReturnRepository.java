package com.pl.carrentalservice.carReturn;

import com.pl.carrentalservice.cars.CarRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarReturnRepository extends JpaRepository<CarReturn, Integer> {
}

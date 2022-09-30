package com.pl.carrentalservice.branches;

import com.pl.carrentalservice.cars.Car;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

public class BranchCars {

//    @ManyToOne
//    @JoinColumn(name = "branch_id")
    List<Car> carsAvailableAtBranch;

    private Car car;


}

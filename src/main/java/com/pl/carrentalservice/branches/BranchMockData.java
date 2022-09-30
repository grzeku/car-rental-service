package com.pl.carrentalservice.branches;

import com.pl.carrentalservice.cars.BodyStyle;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarAvailabilityStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BranchMockData {

    private final BranchService branchService;

    List<Branch> branches = List.of(
            new Branch(1L, new BranchAddress(1L, "Wyzwolenia", 33, 44200, "Rybnik")));

}



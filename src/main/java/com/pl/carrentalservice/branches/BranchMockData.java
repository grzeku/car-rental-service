package com.pl.carrentalservice.branches;

import com.pl.carrentalservice.cars.BodyStyle;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarAvailabilityStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BranchMockData {

    private final BranchService branchService;
    List<Branch> branches = new ArrayList<>();

    @PostConstruct
    void saveMockBranches() {
        new Branch(new BranchAddress(1, "Wyzwolenia", 33, 44200, "Rybnik"));
        branchService.saveBranches(branches);
    }





}



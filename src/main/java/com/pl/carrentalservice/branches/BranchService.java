package com.pl.carrentalservice.branches;

import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.employees.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BranchService {

    private final BranchRepository branchRepository;

    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

    public void saveBranches(List<Branch> branches) {
        log.debug("Saving list of branches");
        branchRepository.saveAll(branches);
    }
}

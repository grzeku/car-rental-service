package com.pl.carrentalservice.employees;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    private final EmployeeRepository repository;
    public List<Employee> getAll() {
        return repository.findAll();
    }

    public void saveEmployees(List<Employee> employees) {
        log.debug("Saving list of employees");
        repository.saveAll(employees);
    }
    public void add(Employee employee) {
        log.debug("Adding employee");
        repository.save(employee);
    }
}

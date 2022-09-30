package com.pl.carrentalservice.employees;

import com.pl.carrentalservice.branches.Branch;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EmployeeMockData {

    private final EmployeeService service;

    @PostConstruct
    void saveMockEmployees() {
        List<Employee> employees = List.of(
                new Employee(1L, "Adam", "Małysz", new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST ),
                new Employee(2L, "Anna", "Dymna",new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(3L, "Mateusz", "Ochal",new Branch(), EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(4L, "Grzegorz", "Kuczera",new Branch(),  EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(5L, "Mateusz", "Ochal",new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(6L, "Mateusz", "Ochal",new Branch(),  EmployeePosition.EMPLOYEE,  Collections.EMPTY_LIST,Collections.EMPTY_LIST));
        service.saveEmployees(employees);
    }
}

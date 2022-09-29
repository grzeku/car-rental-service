package com.pl.carrentalservice.employees;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeMockData {

    private final EmployeeService service;

    @PostConstruct
    void saveMockEmployees() {
        List<Employee> employees = List.of(
                new Employee(1L, "Adam", "Małysz", EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST ),
                new Employee(2L, "Anna", "Dymna", EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(3L, "Mateusz", "Ochal", EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(4L, "Grzegorz", "Kuczera", EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(5L, "Mateusz", "Ochal", EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
                new Employee(6L, "Mateusz", "Ochal", EmployeePosition.EMPLOYEE,  Collections.EMPTY_LIST,Collections.EMPTY_LIST));
        service.saveEmployees(employees);
    }
}

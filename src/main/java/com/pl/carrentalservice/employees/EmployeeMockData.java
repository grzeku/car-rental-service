package com.pl.carrentalservice.employees;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EmployeeMockData {

    private final EmployeeService service;

    @PostConstruct
    void saveMockEmployees() {
        List<Employee> employees = List.of(
                new Employee(UUID.randomUUID(), "Adam", "Małysz", EmployeePosition.EMPLOYEE, "Rybnik"),
                new Employee(UUID.randomUUID(), "Anna", "Dymna", EmployeePosition.EMPLOYEE, "Rybnik"),
                new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.MANAGER, "Katowice"),
                new Employee(UUID.randomUUID(), "Grzegorz", "Kuczera", EmployeePosition.MANAGER, "Warszawa"),
                new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.EMPLOYEE, "Opole"),
                new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.EMPLOYEE, "Poronin"));
        service.saveEmployees(employees);
    }
}

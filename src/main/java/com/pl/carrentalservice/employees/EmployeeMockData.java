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

//    @PostConstruct
//    void saveMockEmployees() {
//        List<Employee> employees = List.of(
//                new Employee(1, "Adam", "Małysz", new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST ),
//                new Employee(2, "Anna", "Dymna",new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
//                new Employee(3, "Mateusz", "Ochal",new Branch(), EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
//                new Employee(4, "Grzegorz", "Kuczera",new Branch(),  EmployeePosition.MANAGER,  Collections.EMPTY_LIST,Collections.EMPTY_LIST),
//                new Employee(5, "Mateusz", "Ochal",new Branch(),  EmployeePosition.EMPLOYEE, Collections.EMPTY_LIST,Collections.EMPTY_LIST),
//                new Employee(6, "Mateusz", "Ochal",new Branch(),  EmployeePosition.EMPLOYEE,  Collections.EMPTY_LIST,Collections.EMPTY_LIST));
//        service.saveEmployees(employees);
//    }
}

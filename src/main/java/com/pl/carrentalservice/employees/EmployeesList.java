package com.pl.carrentalservice.employees;

import lombok.Data;
import org.springframework.stereotype.Component;
import pl.sda.carrental.carrental.branches.Branches;

import java.util.List;
import java.util.UUID;

@Data
@Component
public class EmployeesList {

    List<Employee> employees = List.of(
            new Employee(UUID.randomUUID(), "Adam", "Małysz", EmployeePosition.EMPLOYEE, Branches.SCRANTON),
            new Employee(UUID.randomUUID(), "Anna", "Dymna", EmployeePosition.EMPLOYEE, Branches.SCRANTON),
            new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.MANAGER, Branches.SCRANTON),
            new Employee(UUID.randomUUID(), "Grzegorz", "Kuczera", EmployeePosition.MANAGER, Branches.NEW_YORK),
            new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.EMPLOYEE, Branches.NEW_YORK),
            new Employee(UUID.randomUUID(), "Mateusz", "Ochal", EmployeePosition.EMPLOYEE, Branches.NEW_YORK));
}

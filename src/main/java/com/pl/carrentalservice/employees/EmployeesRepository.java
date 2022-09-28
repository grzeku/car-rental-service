package com.pl.carrentalservice.employees;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeesRepository extends JpaRepository <Employee, Long> {


}

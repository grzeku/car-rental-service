package com.pl.carrentalservice.employees;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    List<Employee> getAllEmployess() {
        log.info("Getting a list of all employees");
        return service.getAll();
    }

    @PostMapping
    void addEmployee(@RequestBody Employee employee) {
        log.info("Adding employee");
        service.add(employee);
    }

}

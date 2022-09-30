package com.pl.carrentalservice.branches;

import com.pl.carrentalservice.employees.Employee;
import lombok.Data;

import java.util.List;
@Data
public class BranchEmployee {

    List<Employee> branchEmployees;
}

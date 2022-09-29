package com.pl.carrentalservice.employees;

import com.pl.carrentalservice.carReturn.CarReturn;
import com.pl.carrentalservice.rent.Rent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="employees")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    //@Type(type = "uuid-char")
    @Column(name="employee_id")
    private Long id;

    private String name;
    private String surname;
    @Enumerated(EnumType.STRING )
    private EmployeePosition employeePositionEnum;
    @OneToMany(mappedBy = "employee")
    private List<CarReturn> carReturns;
    @OneToMany(mappedBy = "employee")
    private List<Rent> rents;

}

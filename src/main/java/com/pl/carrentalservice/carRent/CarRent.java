package com.pl.carrentalservice.carRent;


import com.pl.carrentalservice.employees.Employee;
import com.pl.carrentalservice.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Component
@Table(name="rents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @Column(name="date_of_return")
    private LocalDate dateOfPickUp;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private String remarks;

}
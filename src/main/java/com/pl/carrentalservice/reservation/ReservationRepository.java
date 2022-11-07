package com.pl.carrentalservice.reservation;

import com.pl.carrentalservice.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}

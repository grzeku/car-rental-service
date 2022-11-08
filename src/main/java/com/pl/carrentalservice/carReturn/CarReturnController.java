package com.pl.carrentalservice.carReturn;

import com.pl.carrentalservice.carRent.CarRentRepository;
import com.pl.carrentalservice.carRent.CarRentService;
import com.pl.carrentalservice.employees.EmployeeRepository;
import com.pl.carrentalservice.reservation.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CarReturnController {


    private final CarRentService carRentService;
    private final CarRentRepository carRentrepository;
    private final ReservationRepository reservationRepository;
    private final EmployeeRepository employeeRepository;


}

package com.pl.carrentalservice.carRent;

import com.pl.carrentalservice.branches.Branch;
import com.pl.carrentalservice.branches.BranchAddress;
import com.pl.carrentalservice.branches.BranchRepository;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarRepository;
import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.clients.ClientRepository;
import com.pl.carrentalservice.employees.EmployeeRepository;
import com.pl.carrentalservice.reservation.Reservation;
import com.pl.carrentalservice.reservation.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CarRentController {

    private final CarRentService carRentService;
    private final CarRentRepository carRentRepository;
    private final ReservationRepository reservationRepository;
    private final EmployeeRepository employeeRepository;
    private final ClientRepository clientRepository;
    private final CarRepository carRepository;
    private final BranchRepository branchRepository;

    @GetMapping("/all_rents")
    String getReservations(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Page<CarRent> carRentsPage = carRentService.findPage(page, size);
        List<CarRent> carRents = carRentsPage.getContent();
        List<Integer> sizes = List.of(5, 10, 20);

        model.addAttribute("size", size);
        model.addAttribute("sizes", sizes);
        model.addAttribute("carRents", carRents);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", carRentsPage.getTotalPages());
        model.addAttribute("totalElements", carRentsPage.getTotalElements());

        return "rents";
    }
    @GetMapping("/accept-rent-form")
    String addCarRentForm(final Model model) {
        CarRent carRent = new CarRent();
        List<Client> clients = clientRepository.findAll();
        List<Reservation> reservations = reservationRepository.findAll();
        List<Car> cars = carRepository.findAll();
        List<Branch> branches = branchRepository.findAll();
        model.addAttribute("carRent", carRent);
        model.addAttribute("clients", clients);
        model.addAttribute("cars", cars);
        model.addAttribute("reservations", reservations);
        model.addAttribute("branches", branches);
//        model.addAttribute("branchAddresses", branchAddress);

        return "make-a-rent";

    }
}

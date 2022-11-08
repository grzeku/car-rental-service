package com.pl.carrentalservice.reservation;

import com.pl.carrentalservice.branches.Branch;
import com.pl.carrentalservice.branches.BranchAddress;
import com.pl.carrentalservice.branches.BranchRepository;
import com.pl.carrentalservice.branches.BranchService;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarRepository;
import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.clients.ClientRepository;
import com.pl.carrentalservice.util.HibernateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Table;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ReservationController {

    private final ReservationService service;
    private final ReservationRepository repository;
    private final BranchRepository branchRepository;
    private final CarRepository carRepository;
    private final ClientRepository clientRepository;



    @GetMapping("/reservations")
    String getReservations(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Page<Reservation> reservationPage = service.findPage(page, size);
        List<Reservation> reservations = reservationPage.getContent();
        List<Integer> sizes = List.of(5, 10, 20);

        model.addAttribute("size", size);
        model.addAttribute("sizes", sizes);
        model.addAttribute("reservations", reservations);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", reservationPage.getTotalPages());
        model.addAttribute("totalElements", reservationPage.getTotalElements());

        return "reservations";
    }


    @GetMapping("/make-reservation-form")
    String addReservationForm(final Model model) {
        Reservation reservation = new Reservation();
        List<Branch> branches = branchRepository.findAll();
        List<Car> cars = carRepository.findAll();
        List<Client> clients = clientRepository.findAll();
        BranchAddress branchAddress = new BranchAddress();
        model.addAttribute("reservation", reservation);
        model.addAttribute("branches", branches);
        model.addAttribute("cars", cars);
        model.addAttribute("clients", clients);
//        model.addAttribute("branchAddresses", branchAddress);

        return "make-a-reservation";

    }

    @PostMapping("/make-a-reservation")
    String addReservation(@Valid Reservation reservation, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "make-a-reservation";
        }
        Integer price = reservation.getCar().getPrice();
        reservation.setPricePerDay(price);
        service.saveReservation(reservation);
        log.info("Requested reservation add");
        return "redirect:/reservations";
    }

    @GetMapping("/update-a-reservation/{id}")
    String reservationCarForm(@PathVariable Integer id, final Model model) {

        Reservation reservation = service.findById(id);
        model.addAttribute("reservation", reservation);
        return "/make-a-reservation";
    }

    @PostMapping("/update-a-reservation")
    String makeReservationForCar(@Valid Reservation reservation, BindingResult result) {
        if (result.hasErrors()) {
            return "make-a-reservation";
        }
        service.update(reservation);
        return "redirect:/cars-for-rent";
    }
}

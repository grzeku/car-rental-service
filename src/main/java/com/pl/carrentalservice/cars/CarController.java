package com.pl.carrentalservice.cars;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CarController {
    private final CarService service;
    @Autowired
    private CarRepository repo;
    @GetMapping
    String index() {
        return "index";
    }


    @GetMapping("/list")
        public List<Car> getAll(){

            log.info("All cars requested");
            return service.getAll();

    }


    @PostMapping()
    public void addCar (@RequestBody Car car) {
        log.info("Received car post request");
        service.saveCars(List.of(car));
    }
//    @PutMapping
//
//
//    @DeleteMapping
@GetMapping("/cars")
String getCars(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int size, Model model) {
    Page<Car> carPage = service.findPage(page, size);
    List<Car> cars = carPage.getContent();
    List<Integer> sizes = List.of(5, 10, 20);

    model.addAttribute("size", size);
    model.addAttribute("sizes", sizes);
    model.addAttribute("cars", cars);
    model.addAttribute("currentPage", page);
    model.addAttribute("totalPages", carPage.getTotalPages());
    model.addAttribute("totalElements", carPage.getTotalElements());

    return "cars-for-rent";
}


    @GetMapping("/add-car-form")
    String addEmployeeForm(final Model model) {
        Car car = new Car();
        model.addAttribute("car", car);

        return "add-car";

    }
    @PostMapping("/add-car")
    String addEmployee(@Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "add-car";
        }
        service.saveCar(car);
        log.info("Requested car add");
        return "redirect:/cars";
    }
}

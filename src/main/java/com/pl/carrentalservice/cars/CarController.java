package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.clients.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
@Slf4j
public class CarController {
    private final CarService service;



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


}

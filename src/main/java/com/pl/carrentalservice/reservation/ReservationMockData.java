package com.pl.carrentalservice.reservation;

import lombok.Data;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarMockData;
import com.pl.carrentalservice.clients.Client;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;

@Data
public class ReservationMockData {
    private final CarMockData carMockData;

    List<Car>cars;
    List<Client> clients;

    @PostConstruct
    public List<Reservation> initiateReservationData(){
        return List.of(
                new Reservation(LocalDate.of(2022,9,26), LocalDate.of(2022, 9, 29), LocalDate.of(2022, 9, 31), cars.get(0), clients.get(0), "NewYork", "Chicago", carMockData.getCarPrice(0)));
    }
}

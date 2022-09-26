package com.pl.carrentalservice.renting;

import lombok.Data;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarMockData;
import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.clients.ClientsMockData;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
public class RentMockData {
    private final CarMockData carMockData;
    private final ClientsMockData clientsMockData;
    List<Car>cars;
    List<Client> clients;
@PostConstruct
    public List<Rent> initiateRentData(){
        return List.of(
                new Rent("26.09.2022", "29.09.2022", "30.09.2022", cars.get(0), clients.get(0), "NewYork", "Chicago", carMockData.getCarPrice(0)));
    }
}

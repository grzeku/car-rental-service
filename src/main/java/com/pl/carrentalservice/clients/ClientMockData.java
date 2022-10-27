package com.pl.carrentalservice.clients;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
@Component
@RequiredArgsConstructor
public class ClientMockData {
    private final ClientService service;

    public Client createClient(String name, String surname, String email, String address){
        return new Client(name, surname, email, address);

    }
}

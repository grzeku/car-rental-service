package com.pl.carrentalservice.clients;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Data
@Component
@RequiredArgsConstructor
public class ClientMockData {
    public List<Client> clients = new ArrayList<>();
    @PostConstruct
    public void  initiateClientData() {
         clients = List.of(
                createClient("Mati", "Hautameki", "MatiHautameki@gmail.com", "Sweden, Oslo"),
                createClient("Jane", "Happonen", "JaneHapponen@gmail.com", "Sweden, Oslo"),
                createClient("Adam", "Malysz", "AdamMalysz@gmail.com", "Polska, Wisla"),
                createClient("Piotr", "Zyla", "PiotrZyla@gmail.com", "Polska, Istebna"));
    }
    public Client createClient(String name, String surname, String email, String address){
        return new Client(name, surname, email, address);

    }
    public void add(Client client){
         clients.add(client);
    }

    public List<Client> getAll() {
        return clients;
    }
}

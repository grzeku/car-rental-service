package com.pl.carrentalservice.clients;

import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
public class ClientsMockData {
    @PostConstruct
    public List<Client> initiateClientData() {
        return List.of(
                new Client("Mati", "Hautameki", "MatiHautameki@gmail.com", "Sweden, Oslo"),
                new Client("Jane", "Happonen", "JaneHapponen@gmail.com", "Sweden, Oslo"),
                new Client("Adam", "Malysz", "AdamMalysz@gmail.com", "Polska, Wisla"),
                new Client("Piotr", "Zyla", "PiotrZyla@gmail.com", "Polska, Istebna"));
    }
}

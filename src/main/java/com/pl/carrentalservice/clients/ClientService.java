package com.pl.carrentalservice.clients;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;

    public List<Client> getAll() {
    return repository.findAll();
    }

     void addClients(List<Client> clients) {
         repository.saveAll(clients);
    }
}

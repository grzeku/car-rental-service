package com.pl.carrentalservice.clients;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;
    private final ClientMockData mockData;
    public List<Client> getAll() {
    return mockData.getAll();
    }

    public void addClient(Client client) {
         mockData.add(client);
    }
}

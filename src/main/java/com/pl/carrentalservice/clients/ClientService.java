package com.pl.carrentalservice.clients;


import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientService {
    private final ClientRepository repository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(ClientRepository repository, @Lazy PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }
    public void add(CreateClientRequest request) {
        Client client = mapToClient(request);
        repository.save(client);
    }


    private Client mapToClient(CreateClientRequest request) {
        String email = request.getEmail();
        if (repository.existsById(email)) {
            throw new RuntimeException("Username " + email + " already exists");
        }
        return Client.of(
                request.getEmail(),
                request.getName(),
                request.getSurname(),
                request.getAddress(),
                request.getReservations(),
                "USER",
                passwordEncoder.encode(request.getPassword()));

    }
    public List<Client> getAll() {
    return repository.findAll();
    }

     void addClients(List<Client> clients) {
         repository.saveAll(clients);
    }

    public Client findByEmail(String email) {
        return repository
                .findById(email)
                .orElseThrow(() -> new UsernameNotFoundException(email + " was not found"));
    }
    }

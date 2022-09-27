package com.pl.carrentalservice.clients;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientController {
private final ClientService service;

    @GetMapping("/list")
    public List<Client> getAll(){
    log.info("All clients requested");
    return service.getAll();
    }

    @PostMapping()
    public void addClient (@RequestBody Client client){
        log.info("Received post request");
         service.addClients(List.of(client));
    }
}

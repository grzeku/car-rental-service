package com.pl.carrentalservice.clients;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientController {
private final ClientService service;

//Client client1 = new Client("Mati", "Hautameki", "Emailik", "Fajkowo, Fajka");
//Client client2 = new Client("Matik", "Hautamekik", "Emailikk", "Fajkkowo, Fajkak");
//    List<Client> clients = List.of(client1,client2);
    @GetMapping("/list")
    public List<Client> getAll(){
    log.info("All requested");
    return service.getAll();
    }

    @PostMapping()
    public void addClient (@RequestBody Client client){
        log.info("Received post request");
         service.addClient(client);
    }
}

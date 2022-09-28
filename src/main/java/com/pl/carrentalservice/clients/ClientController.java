package com.pl.carrentalservice.clients;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientController {
private final ClientService service;

    @GetMapping("/list")
    public List<Client> getAll(){
    log.info("All clients requested");
    return service.getAll();
    }

    @PostMapping("/addclient")
    public void addClient (@RequestBody Client client){
        log.info("Received post request");
         service.addClients(List.of(client));
    }

    @GetMapping
    String registrationTemplate(final Model model) {
        model.addAttribute("client", new CreateClientRequest());
        return "registration";
    }

    @PostMapping
    String register(@ModelAttribute CreateClientRequest request) {
        log.info("Received request to register {}", request.getEmail());
        service.add(request);
        return "index";
    }
}

package com.pl.carrentalservice.clients;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientController {
private final ClientService service;
    @GetMapping("/list")
    String getClients(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Page<Client> clientPage = service.findPage(page, size);
        List<Client> clients = clientPage.getContent();
        List<Integer> sizes = List.of(5, 10, 20);
        model.addAttribute("size", size);
        model.addAttribute("sizes", sizes);
        model.addAttribute("clients", clients);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", clientPage.getTotalPages());
        model.addAttribute("totalElements", clientPage.getTotalElements());
        return "clients/list";
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

package com.pl.carrentalservice.security;

import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.clients.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final ClientService service;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client= service.findByEmail(email);
        return new ClientDetailsAdapter(client);
    }
}

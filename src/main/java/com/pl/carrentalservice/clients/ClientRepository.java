package com.pl.carrentalservice.clients;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, String> {
}

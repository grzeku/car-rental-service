package com.pl.carrentalservice.clients;

import com.pl.carrentalservice.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")

public class Client {
   @Id
   @Column(unique = true, name = "client_id")
   private String email;
   @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String address;
    @Column
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
    @Column
    private String role;
    @Column
    private String password;

    public Client(String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public Client(String name, String surname, String email, String address, String role, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.role = role;
        this.password = password;
    }
}

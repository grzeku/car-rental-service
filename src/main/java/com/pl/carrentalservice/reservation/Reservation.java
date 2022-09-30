package com.pl.carrentalservice.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.clients.Client;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
@Id
@GeneratedValue
@Column(name = "reservation_id")
    private Integer id;

    private LocalDate dateOfReservation;
    private LocalDate dateOfPickUp;
    private LocalDate dateOfReturn;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    private String branchStart;
    private String branchEnd;
    private Integer pricePerDay;


    public Reservation(LocalDate dateOfReservation, LocalDate dateOfPickUp, LocalDate dateOfReturn, Car car, Client client, String branchStart, String branchEnd, Integer pricePerDay) {
        this.dateOfReservation = dateOfReservation;
        this.dateOfPickUp = dateOfPickUp;
        this.dateOfReturn = dateOfReturn;
        this.car = car;
        this.client = client;
        this.branchStart = branchStart;
        this.branchEnd = branchEnd;
        this.pricePerDay = pricePerDay;
    }

    private String date;


}

package com.pl.carrentalservice.reservation;

import com.pl.carrentalservice.branches.Branch;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.clients.Client;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table(name="reservations")
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "reservation_id")
    private Integer id;
    @Column(name="date_of_reservation")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfReservation;
    @Column(name="date_of_pickup")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfPickUp;
    @Column(name="date_of_return")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfReturn;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;


    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name="branch_start")
    private Branch branchStart;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name="branch_end")
    private Branch branchEnd;

    @Column(name="price_per_day")
    private Integer pricePerDay;

    public Reservation(LocalDate dateOfReservation, LocalDate dateOfPickUp, LocalDate dateOfReturn, Car car, Client client, Branch branchStart, Branch branchEnd, Integer pricePerDay) {
        this.dateOfReservation = dateOfReservation;
        this.dateOfPickUp = dateOfPickUp;
        this.dateOfReturn = dateOfReturn;
        this.car = car;
        this.client = client;
        this.branchStart = branchStart;
        this.branchEnd = branchEnd;
        this.pricePerDay = pricePerDay;
    }

}

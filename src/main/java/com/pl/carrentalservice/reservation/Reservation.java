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
    private LocalDate dateOfReservation;
    @Column(name="date_of_pickup")
    private LocalDate dateOfPickUp;
    @Column(name="date_of_return")
    private LocalDate dateOfReturn;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    @Column(name="branch_start")
    private String branchStart;
    @Column(name="branch_end")
    private String branchEnd;
    @Column(name="price_per_day")
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

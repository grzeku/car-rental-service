package com.pl.carrentalservice.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.clients.Client;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
@Id
@GeneratedValue
@Column(name = "rent_id")
    private Integer id;

    private Calendar dateOfReservation;
    private Calendar datePickUp;
    private Calendar dateReturn;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    private String branchStart;
    private String branchEnd;
    private Integer pricePerDay;


    public Reservation(Calendar dateOfReservation, Calendar datePickUp, Calendar dateReturn, Car car, Client client, String branchStart, String branchEnd, Integer pricePerDay) {
        this.dateOfReservation = dateOfReservation;
        this.datePickUp = datePickUp;
        this.dateReturn = dateReturn;
        this.car = car;
        this.client = client;
        this.branchStart = branchStart;
        this.branchEnd = branchEnd;
        this.pricePerDay = pricePerDay;
    }

    private String date;


}

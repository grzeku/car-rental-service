package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.branches.Branch;
import com.pl.carrentalservice.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="car_id")
    private Integer id;
    @Column
    private String make;
    private String model;
    @Column(name="body_style")
    @Enumerated(EnumType.STRING)
    private BodyStyle bodyStyle ;
    @Column(name="production_year")
    private Integer productionYear;
    private Integer mileage;
    @Column(name="car_availibility_status")
    @Enumerated(EnumType.STRING)
    private CarAvailabilityStatus carAvailabilityStatus;
    private Integer price;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="start_branch")
    private Branch startBranch;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="end_branch")
    private Branch endBranch;

    public Car(String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.carAvailabilityStatus = carAvailabilityStatus;
        this.price = price;
    }

    public Car(Integer id, String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.carAvailabilityStatus = carAvailabilityStatus;
        this.price = price;
    }

    public Car(String make, String model, BodyStyle bodyStyle, Integer productionYear, Integer mileage, CarAvailabilityStatus carAvailabilityStatus, Integer price, Branch startBranch, Branch endBranch) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.carAvailabilityStatus = carAvailabilityStatus;
        this.price = price;
        this.startBranch = startBranch;
        this.endBranch = endBranch;
    }
}



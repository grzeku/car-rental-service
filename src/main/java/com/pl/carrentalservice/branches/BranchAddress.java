package com.pl.carrentalservice.branches;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
@Table(name="branch_address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchAddress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer id;

    private String street;
    @Column(name="street_number")
    private int streetNumber;
    @Column(name="postal_code")
    private int postalCode;
    private String city;

    public BranchAddress(String street, int streetNumber, int postalCode, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }
}

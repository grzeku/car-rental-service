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
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchAddress {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    private String street;
    private int streetNumber;
    private int postalCode;
    private String city;

    public BranchAddress(String street, int streetNumber, int postalCode, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }
}

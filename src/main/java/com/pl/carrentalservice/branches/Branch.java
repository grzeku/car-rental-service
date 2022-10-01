package com.pl.carrentalservice.branches;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "Branches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "branch_id")
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address_id")
    private BranchAddress branchAddress;




//    List<Car> carsAvailableAtBranch(Branch branch) {
//        List<Car> cars = new ArrayList<>();
//        return cars.stream().filter(car -> car.getEndBranch().equals(branch))
//                .collect(Collectors.toList());
//    }
public Branch (BranchAddress branchAddress){
    this.branchAddress = branchAddress;
}
}

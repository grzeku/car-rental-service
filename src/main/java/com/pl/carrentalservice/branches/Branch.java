package com.pl.carrentalservice.branches;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;


@Entity
@Table(name = "branches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotFound(action = NotFoundAction.IGNORE)
    @Column(name = "branch_id")
    private Integer id;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "address_id")
    private BranchAddress branchAddress;
    public Branch(BranchAddress branchAddress) {
        this.branchAddress = branchAddress;
    }
}
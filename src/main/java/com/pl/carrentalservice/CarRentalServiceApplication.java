package com.pl.carrentalservice;

import com.pl.carrentalservice.branches.Branch;
import com.pl.carrentalservice.branches.BranchAddress;
import com.pl.carrentalservice.cars.*;
import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CarRentalServiceApplication {
    private static CarService carService;
    private static CarController controller;
    final static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    final static EntityManager entityManager = sessionFactory.createEntityManager();

    public static void main(String[] args) {
        SpringApplication.run(CarRentalServiceApplication.class, args);


        entityManager.getTransaction().begin();

        BranchAddress branchAddress1 = new BranchAddress("Jasna", 17, 44200, "Rybnik");
        BranchAddress branchAddress2 = new BranchAddress("Wyzwolenia", 15, 44200, "Rybnik");
        Branch branch1 = new Branch(branchAddress1);
        Branch branch2 = new Branch(branchAddress2);
        Car car1 = new Car("Audi", "A4", BodyStyle.SEDAN, 1994, 200000, CarAvailabilityStatus.AVAILABLE, 39, branch1, branch2);
        Car car2 = new Car("Audi", "A4", BodyStyle.SEDAN, 1995, 210000, CarAvailabilityStatus.AVAILABLE, 39, branch1, branch2);
        Car car3 = new Car("Audi", "A4", BodyStyle.TOURING, 1992, 202000, CarAvailabilityStatus.AVAILABLE, 39, branch1, branch2);
        Car car4 = new Car("Audi", "A4", BodyStyle.SEDAN, 1991, 200300, CarAvailabilityStatus.AVAILABLE, 39, branch1, branch2);
        Car car5 = new Car("Audi", "A4", BodyStyle.TOURING, 2012, 200040, CarAvailabilityStatus.AVAILABLE, 59, branch1, branch2);
        Car car6 = new Car("BMW", "M4", BodyStyle.COUPE, 2021, 200040, CarAvailabilityStatus.RENTED, 159, branch1, branch2);
        Car car7 = new Car("Bentley", "Continental GT", BodyStyle.COUPE, 2012, 91040, CarAvailabilityStatus.UNAVAILABLE, 259, branch1, branch2);
        Car car8 = new Car("Ferrari", "California", BodyStyle.COUPE, 2017, 24040, CarAvailabilityStatus.RENTED, 259, branch1, branch2);
        Car car9 = new Car("Lamborghini", "Huracan", BodyStyle.COUPE, 2021, 10020, CarAvailabilityStatus.AVAILABLE, 259, branch1, branch2);
        Car car10 = new Car("Fiat", "500", BodyStyle.COMPACT, 2022, 12040, CarAvailabilityStatus.AVAILABLE, 49, branch1, branch2);
        for (BranchAddress branchAddress : Arrays.asList(branchAddress1, branchAddress2)) {
            entityManager.persist(branchAddress);
        }
        for (Branch branch : Arrays.asList(branch1, branch2)) {
            entityManager.persist(branch);
        }
        for (Car car : Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10)) {
            entityManager.persist(car);
        }


        entityManager.getTransaction().commit();

    }

}

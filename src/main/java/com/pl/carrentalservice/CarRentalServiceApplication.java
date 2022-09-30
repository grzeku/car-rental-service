package com.pl.carrentalservice;

import com.pl.carrentalservice.cars.BodyStyle;
import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.cars.CarAvailabilityStatus;
import com.pl.carrentalservice.cars.CarService;
import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class CarRentalServiceApplication {
    private static CarService carService;

    final static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    final static EntityManager entityManager = sessionFactory.createEntityManager();

    public static void main(String[] args) {
        SpringApplication.run(CarRentalServiceApplication.class, args);


            entityManager.getTransaction().begin();



                   Car car1 = new Car("Audi", "A4", BodyStyle.SEDAN, 1994, 200000, CarAvailabilityStatus.AVAILABLE, 39);
                   Car car2 = new Car("Audi", "A4", BodyStyle.SEDAN, 1995, 210000, CarAvailabilityStatus.AVAILABLE, 39);
                   Car car3 = new Car("Audi", "A4", BodyStyle.TOURING, 1992, 202000, CarAvailabilityStatus.AVAILABLE, 39);
                   Car car4 = new Car("Audi", "A4", BodyStyle.SEDAN, 1991, 200300, CarAvailabilityStatus.AVAILABLE, 39);
                   Car car5 = new Car("Audi", "A4", BodyStyle.TOURING, 2012, 200040, CarAvailabilityStatus.AVAILABLE, 59);
                   Car car6 = new Car("BMW", "M4", BodyStyle.COUPE, 2021, 200040, CarAvailabilityStatus.RENTED, 159);
                   Car car7 = new Car("Bentley", "Continental GT", BodyStyle.COUPE, 2012, 91040, CarAvailabilityStatus.UNAVAILABLE, 259);
                   Car car8 = new Car("Ferrari", "California", BodyStyle.COUPE, 2017, 24040, CarAvailabilityStatus.RENTED, 259);
                   Car car9 = new Car("Lamborghini", "Huracan", BodyStyle.COUPE, 2021, 10020, CarAvailabilityStatus.AVAILABLE, 259);
                   Car car10 = new Car("Fiat", "500", BodyStyle.COMPACT, 2022, 12040, CarAvailabilityStatus.AVAILABLE, 49);

            entityManager.persist(car1);
            entityManager.persist(car2);
            entityManager.persist(car3);
            entityManager.persist(car4);
            entityManager.persist(car5);
            entityManager.persist(car6);
            entityManager.persist(car7);
            entityManager.persist(car8);
            entityManager.persist(car9);
            entityManager.persist(car10);
            entityManager.getTransaction().commit();

        }

    }


package com.pl.carrentalservice;

import com.pl.carrentalservice.clients.Client;
import com.pl.carrentalservice.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class CarRentalServiceApplication {

	public static void main(String[] args) {SpringApplication.run(CarRentalServiceApplication.class, args);
		final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		final EntityManager entityManager = sessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Client client = new Client("Jan", "kapusta", "figazmakiem", "dupa");
		entityManager.persist(client);
		entityManager.getTransaction().commit();


	}




}

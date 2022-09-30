package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.util.HibernateUtil;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    final EntityManager entityManager = sessionFactory.createEntityManager();
    private final CarRepository repository;
    public List<Car> getAll() { return repository.findAll();}

    public void addCars(List <Car> cars) { repository.saveAll(cars);}

    public void saveCars(List<Car> cars) {
      // entityManager.getTransaction().begin();
        repository.saveAll(cars);
        //entityManager.getTransaction().commit();
    }



    public Page<Car> findPage(int number, int size) {
        PageRequest pageRequest = PageRequest.of(number - 1, size);
        return repository.findAll(pageRequest);
    }
}

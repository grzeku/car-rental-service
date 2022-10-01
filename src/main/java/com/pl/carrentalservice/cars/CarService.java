package com.pl.carrentalservice.cars;

import com.pl.carrentalservice.branches.Branch;
import com.pl.carrentalservice.util.HibernateUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Data
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

    List<Car> carsAvailableAtBranch(Branch branch) {
        List<Car> cars = new ArrayList<>();
        return cars.stream().filter(car -> car.getEndBranch().equals(branch))
                .collect(Collectors.toList());
    }


    public void saveCar(Car car) {
        entityManager.getTransaction().begin();
        entityManager.persist(car);
       // repository.save(car);

        entityManager.getTransaction().commit();
    }
}
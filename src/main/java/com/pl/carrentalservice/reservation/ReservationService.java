package com.pl.carrentalservice.reservation;

import com.pl.carrentalservice.cars.Car;
import com.pl.carrentalservice.util.HibernateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationService {

    private final ReservationRepository repository;
    final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    final EntityManager entityManager = sessionFactory.createEntityManager();

    public void saveReservation(Reservation reservation) {
        entityManager.getTransaction().begin();
        entityManager.persist(reservation);
        entityManager.getTransaction().commit();
    }

    public Reservation findById(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public void update(Reservation reservation) {
        repository.save(reservation);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Page<Reservation> findPage(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page -1, size);
        return repository.findAll(pageRequest);
    }
}

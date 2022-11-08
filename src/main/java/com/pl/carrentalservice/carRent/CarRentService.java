package com.pl.carrentalservice.carRent;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarRentService {
    private final CarRentRepository repository;
    public Page<CarRent> findPage(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page -1, size);
        return repository.findAll(pageRequest);
    }
}

package com.codegym.m4b17th.service;

import com.codegym.m4b17th.repo.entity.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> fillAll();

    void updateOrSave(Customer customer);

    void delete(Long id);

    Optional<Customer> findById(Long id);
}

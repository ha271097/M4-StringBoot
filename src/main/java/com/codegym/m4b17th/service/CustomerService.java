package com.codegym.m4b17th.service;

import com.codegym.m4b17th.repo.RepoCustomer;
import com.codegym.m4b17th.repo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private RepoCustomer repoCustomer;

    @Override
    public Iterable<Customer> fillAll() {
        return repoCustomer.findAll();
    }

    @Override
    public void updateOrSave(Customer customer) {
        repoCustomer.save(customer);
    }

    @Override
    public void delete(Long id) {
        repoCustomer.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repoCustomer.findById(id);
    }
}

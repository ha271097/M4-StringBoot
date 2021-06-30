package com.codegym.m4b17th.service.customerservice;

import com.codegym.m4b17th.repo.RepoCustomer;
import com.codegym.m4b17th.repo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService, UserDetailsService {


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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Customer customer = this.getCusByName(username);
        //lay quyen cua doi tuong do
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(customer.getRole());

        //Chuyen doi tuong do sang UserDetail
        UserDetails userDetails = new User(customer.getName(), customer.getPass(), authorities);
        return userDetails;
    }
    @Override
    public Customer getCusByName(String name) {
        return repoCustomer.findCustomerByName(name);
    }
}

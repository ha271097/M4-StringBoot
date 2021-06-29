package com.codegym.m4b17th.repo;

import com.codegym.m4b17th.repo.entity.Customer;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCustomer extends CrudRepository<Customer, Long>{
}

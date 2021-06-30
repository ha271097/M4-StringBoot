package com.codegym.m4b17th.repo;

import com.codegym.m4b17th.repo.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRole extends CrudRepository<Role, Long> {

}

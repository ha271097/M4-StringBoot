package com.codegym.m4b17th.service.roleservice;

import com.codegym.m4b17th.repo.entity.Role;

import java.util.Optional;

public interface IRoleService {
  Iterable<Role> findAll();
    Optional<Role> findById(Long id);
    void save(Role role);
    void remove(Long id);

}

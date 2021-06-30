package com.codegym.m4b17th.service.roleservice;

import com.codegym.m4b17th.repo.RepoRole;
import com.codegym.m4b17th.repo.entity.Role;
//import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
 private RepoRole repoRole;
    @Override
    public Iterable<Role> findAll() {
        return repoRole.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Role role) {
        repoRole.save(role);
    }

    @Override
    public void remove(Long id) {
        repoRole.deleteById(id);
    }
}

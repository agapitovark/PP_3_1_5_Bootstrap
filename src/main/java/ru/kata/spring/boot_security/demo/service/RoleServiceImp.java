package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepo;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    private final RoleRepo roleRepo;

    @Autowired
    public RoleServiceImp(RoleRepo roleRepo) {

        this.roleRepo = roleRepo;
    }

    public List<Role> getRoles() {

        return roleRepo.findAll();
    }
}


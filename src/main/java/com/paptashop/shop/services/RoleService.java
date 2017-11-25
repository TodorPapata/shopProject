package com.paptashop.shop.services;

import com.paptashop.shop.entities.Role;
import com.paptashop.shop.exceptions.EntityNotFoundException;
import com.paptashop.shop.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements RoleServiceInterface {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getByName(String name) {
        return this.roleRepository.findByName(name);
    }

    @Override
    public Role getById(Integer id) {
        return this.roleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Role with that id."));
    }
}

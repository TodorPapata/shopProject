package com.paptashop.shop.services;

import com.paptashop.shop.entities.Role;

public interface RoleServiceInterface {
    Role getByName(String name);

    Role getById(Integer id);
}

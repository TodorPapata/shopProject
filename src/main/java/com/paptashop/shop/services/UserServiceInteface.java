package com.paptashop.shop.services;

import com.paptashop.shop.entities.User;

import java.util.List;

public interface UserServiceInteface {
    List<User> getAllUsers();

    User updateUser(User user);

    User registerUser(User user);

    User getById(Long userId);
}

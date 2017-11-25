package com.paptashop.shop.services;

import com.paptashop.shop.entities.Role;
import com.paptashop.shop.entities.User;
import com.paptashop.shop.exceptions.EmailTakenException;
import com.paptashop.shop.exceptions.EntityNotFoundException;
import com.paptashop.shop.repositories.RoleRepository;
import com.paptashop.shop.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService implements UserServiceInteface {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User updatedUser = new User();
        BeanUtils.copyProperties(user, updatedUser, "id", "password", "enabled", "roles");

        return updatedUser;
    }

    @Override
    public User registerUser(User user) {
        if (emailExists(user.getEmail())) {
            throw new EmailTakenException(
                    "There is an account with that email address");
        }

        List<Role> roles = new ArrayList<>();
        roles.add(this.roleRepository.findByName("ROLE_USER"));
        user.setRoles(roles);

        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        return this.userRepository.save(user);
    }

    @Override
    public User getById(Long userId) {
        return this.userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("There is no user with such ID"));
    }

    private boolean emailExists(String email) {
        return this.userRepository.findByEmail(email).isPresent();
    }

}

package com.paptashop.shop.repositories;

import com.paptashop.shop.entities.Cart;
import com.paptashop.shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> getByUser(User user);

    Optional<Cart> getById(Long id);
}

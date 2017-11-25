package com.paptashop.shop.services;

import com.paptashop.shop.entities.Cart;
import com.paptashop.shop.entities.Product;
import com.paptashop.shop.entities.User;
import com.paptashop.shop.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CartService implements CartServiceInterface {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart getShoppingCart(User user) {
        return null;
    }

    @Override
    public Cart getShoppingCartById(Long id) {
        return null;
    }

    @Override
    public void addItem(Product product) {

    }

    @Override
    public void createOrder(Cart cart) {

    }

    @Override
    public void removeItem(Long itemId) {

    }
}

package com.paptashop.shop.services;

import com.paptashop.shop.entities.Cart;
import com.paptashop.shop.entities.Product;
import com.paptashop.shop.entities.User;

public interface CartServiceInterface {

    Cart getShoppingCart(User user);

    Cart getShoppingCartById(Long id);

    void addItem(Product product);

    void createOrder(Cart cart);

    void removeItem(Long itemId);
}

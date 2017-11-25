package com.paptashop.shop.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private UserInformation buyerInformation;
    private List<Product> products;
    private Date dateCreated;

    public Order() {
        this.dateCreated = Calendar.getInstance().getTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserInformation getBuyerInformation() {
        return buyerInformation;
    }

    public void setBuyerInformation(UserInformation buyerInformation) {
        this.buyerInformation = buyerInformation;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}

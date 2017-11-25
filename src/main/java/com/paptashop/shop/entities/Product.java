package com.paptashop.shop.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ProductTemplate productTemplate;
    @Min(1)
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductTemplate getProductTemplate() {
        return productTemplate;
    }

    public void setProductTemplate(ProductTemplate productTemplate) {
        this.productTemplate = productTemplate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

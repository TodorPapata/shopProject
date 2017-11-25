package com.paptashop.shop.services;

import com.paptashop.shop.entities.ProductTemplate;

import java.util.List;

public interface CatalogServiceInterface {
    List<ProductTemplate> showAllProductTemplates();

    ProductTemplate showProductTemplateById(Long id);

    ProductTemplate showProductTemplateByCode(String code);

    void addProductTemplate(ProductTemplate productTemplate);
}

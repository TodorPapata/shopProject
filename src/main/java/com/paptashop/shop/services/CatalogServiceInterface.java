package com.paptashop.shop.services;

import com.paptashop.shop.entities.ProductTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CatalogServiceInterface {
    List<ProductTemplate> showAllProductTemplates();

    ProductTemplate showProductTemplateById(Long id);

    ProductTemplate showProductTemplateByCode(String code);

    Page<ProductTemplate> showProductTemplatesPaged(Pageable pageable);

    void addProductTemplate(ProductTemplate productTemplate);
}

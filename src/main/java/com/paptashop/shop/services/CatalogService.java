package com.paptashop.shop.services;

import com.paptashop.shop.entities.ProductTemplate;
import com.paptashop.shop.exceptions.EntityNotFoundException;
import com.paptashop.shop.repositories.ProductTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService implements CatalogServiceInterface {

    @Autowired
    private ProductTemplateRepository productTemplateRepository;

    @Override
    public List<ProductTemplate> showAllProductTemplates() {
        return this.productTemplateRepository.findAll();
    }

    @Override
    public ProductTemplate showProductTemplateById(Long id) {
        return this.productTemplateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no ProductTemplate with that ID."));
    }

    @Override
    public ProductTemplate showProductTemplateByCode(String code) {
        return this.productTemplateRepository.findByCode(code)
                .orElseThrow(() -> new EntityNotFoundException("There is no ProductTemplate with that code"));
    }

    @Override
    public void addProductTemplate(ProductTemplate productTemplate){
        this.productTemplateRepository.save(productTemplate);
    }
}

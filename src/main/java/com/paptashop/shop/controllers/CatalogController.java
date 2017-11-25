package com.paptashop.shop.controllers;

import com.paptashop.shop.entities.ProductTemplate;
import com.paptashop.shop.services.CatalogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/products")
public class CatalogController {
    @Autowired
    private CatalogServiceInterface catalogService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<ProductTemplate>> getAll() {
        return ResponseEntity.ok()
                .body(this.catalogService.showAllProductTemplates());
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity<ProductTemplate> getProduct(@PathVariable("productId") Long productId) {
        return ResponseEntity.ok()
                .body(this.catalogService.showProductTemplateById(productId));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addProduct(@RequestBody @Valid ProductTemplate productTemplate){
        this.catalogService.addProductTemplate(productTemplate);
    }
}

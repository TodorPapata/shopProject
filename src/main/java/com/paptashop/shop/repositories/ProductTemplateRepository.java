package com.paptashop.shop.repositories;

import com.paptashop.shop.entities.ProductTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductTemplateRepository extends JpaRepository<ProductTemplate, Long> {

    Optional<ProductTemplate> findById(Long id);

    Optional<ProductTemplate> findByCode(String code);
}

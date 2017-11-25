package com.paptashop.shop.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageServiceInterface {
    void store(MultipartFile file);
    Resource loadFile(String fileName);
    void deleteAll();
    void init();
}

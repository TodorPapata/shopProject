package com.paptashop.shop;

import com.paptashop.shop.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan("com.paptashop.shop")
public class ShopApplication implements CommandLineRunner{
    @Resource
    StorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        storageService.deleteAll();
        storageService.init();
    }
}

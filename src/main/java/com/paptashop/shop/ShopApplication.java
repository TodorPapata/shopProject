package com.paptashop.shop;

import com.paptashop.shop.entities.ProductTemplate;
import com.paptashop.shop.services.CatalogServiceInterface;
import com.paptashop.shop.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner{
    private static final String IMAGE_URL = "http://chariotlearning.com/wp-content/uploads/2015/12/Testing_in_Progress.gif";
    @Resource
    StorageService storageService;
    @Resource
    CatalogServiceInterface catalogService;

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        storageService.deleteAll();
        storageService.init();
        catalogService.addProductTemplate(new ProductTemplate(1L,"test1",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(2L,"test2",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(3L,"test3",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(4L,"test4",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(5L,"test5",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(6L,"test6",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(7L,"test7",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(8L,"test8",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(9L,"test9",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
        catalogService.addProductTemplate(new ProductTemplate(0L,"test0",new BigDecimal(3),"code",IMAGE_URL, new Date() ));
    }
}

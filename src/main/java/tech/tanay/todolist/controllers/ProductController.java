package tech.tanay.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.tanay.todolist.ProductEntity;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<ProductEntity> getProducts() {
        var products = List.of(
            new ProductEntity("sku1", "Product 1", 100),
            new ProductEntity("sku2", "Product 2", 200),
            new ProductEntity("sku3", "Product 3", 300)
        );
        return products;
    }
}

package tech.tanay.todolist.controllers;

import com.opencsv.exceptions.CsvBeanIntrospectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.tanay.todolist.ProductEntity;
import tech.tanay.todolist.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<ProductEntity> getProducts() {
        return null;
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody ProductEntity product) {
        productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/product/{sku}")
    public ProductEntity getProduct(@PathVariable String sku) {
        return productRepository.findById(sku).orElse(null);
    }
}

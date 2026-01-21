package com.example.demo.controllers;

import com.example.demo.dto.CreateProduct;
import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing products in the e-commerce system.
 * Provides endpoints for creating and retrieving products.
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Creates a new product.
     * @param request The product creation request containing name, description, price, and stock.
     * @return The created product.
     */
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody CreateProduct request) {
        Product product = productService.createProduct(request);
        return ResponseEntity.ok(product);
    }

    /**
     * Retrieves all products.
     * @return List of all products in the system.
     */
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}

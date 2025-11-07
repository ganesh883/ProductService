package org.example.productservice.controllers;

import org.example.productservice.models.Product;
import org.example.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }



    // http://localhost:8080/products/1
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
           return productService.getSingleProduct(productId);
    }

    // http://localhost:8080/products
    @GetMapping
    public List<Product> getAllProducts(){
            return new ArrayList<>();
    }

    @PostMapping
    public Product createProduct(){
            return new Product();
    }

    // http://localhost:8080/products/1
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }

    @PatchMapping("/{id}") //Partial Update
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
    }

    @PutMapping("/{id}") //Replace the entire product object
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){
    }
}

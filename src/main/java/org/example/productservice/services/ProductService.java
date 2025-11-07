package org.example.productservice.services;

import org.example.productservice.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Void createProduct(Product product);

    Void updateProduct(Product product);

    Void deleteProduct(Long productId);

    Void replaceProduct(Long productId, Product product);



}

package org.example.productservice.services;

import org.example.productservice.models.Product;

import java.util.List;

public class FakeStoreProductService implements ProductService{

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Void createProduct(Product product) {
        return null;
    }

    @Override
    public Void updateProduct(Product product) {
        return null;
    }

    @Override
    public Void deleteProduct(Long productId) {
        return null;
    }

    @Override
    public Void replaceProduct(Long productId, Product product) {
        return null;
    }
}

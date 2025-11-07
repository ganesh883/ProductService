package org.example.productservice.services;

import org.example.productservice.dtos.FakeStoreProductDto;
import org.example.productservice.models.Category;
import org.example.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getSingleProduct(Long productId) {

        RestTemplate restTemplate = new RestTemplate();

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestore.com/products/"+productId, FakeStoreProductDto.class);

        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
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

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {

        Product product = new Product();
        product.setCategory(new Category());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImage(fakeStoreProductDto.getImage());
        product.setId(fakeStoreProductDto.getId());
        product.getCategory().setValue(fakeStoreProductDto.getCategory());

        return product;
    }
}

package com.hajuna.ecommerceshop.service.interfaces;

import com.hajuna.ecommerceshop.dto.ProductDto;
import com.hajuna.ecommerceshop.model.Product;
import com.hajuna.ecommerceshop.dto.request.AddProductRequest;
import com.hajuna.ecommerceshop.dto.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> convertDTOList(List<Product> products);
    ProductDto convertDTO(Product product);
}

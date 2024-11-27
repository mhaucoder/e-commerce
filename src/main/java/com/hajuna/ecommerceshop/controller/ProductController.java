package com.hajuna.ecommerceshop.controller;


import com.hajuna.ecommerceshop.common.APIResponse;
import com.hajuna.ecommerceshop.dto.ProductDto;
import com.hajuna.ecommerceshop.model.Product;
import com.hajuna.ecommerceshop.dto.request.AddProductRequest;
import com.hajuna.ecommerceshop.dto.request.ProductUpdateRequest;
import com.hajuna.ecommerceshop.service.interfaces.IProductService;
import com.hajuna.ecommerceshop.util.ResponseUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private final IProductService productService;

    @GetMapping("/getAll")
    public ResponseEntity<APIResponse> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("product/{productId}")
    public ResponseEntity<APIResponse> getProductById(@PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        ProductDto productDto = productService.convertDTO(product);
        return ResponseUtils.ok(productDto);
    }

    @PostMapping("/product")
    public ResponseEntity<APIResponse> addProduct(@RequestBody AddProductRequest product) {
        Product theProduct = productService.addProduct(product);
        ProductDto productDto = productService.convertDTO(theProduct);
        return ResponseUtils.ok(productDto);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<APIResponse> updateProduct(@RequestBody ProductUpdateRequest request, @PathVariable Long productId) {
        Product theProduct = productService.updateProduct(request, productId);
        ProductDto productDto = productService.convertDTO(theProduct);
        return ResponseUtils.ok(productDto);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<APIResponse> deleteProduct(@PathVariable Long productId) {
        productService.deleteProductById(productId);
        return ResponseUtils.ok(productId);
    }

    @GetMapping("/products/by/brand-and-name")
    public ResponseEntity<APIResponse> getProductByBrandAndName(@RequestParam String brandName, @RequestParam String productName) {
        List<Product> products = productService.getProductsByBrandAndName(brandName, productName);
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("/products/by/category-and-brand")
    public ResponseEntity<APIResponse> getProductByCategoryAndBrand(@RequestParam String category, @RequestParam String brand) {
        List<Product> products = productService.getProductsByCategoryAndBrand(category, brand);
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("/products/{name}")
    public ResponseEntity<APIResponse> getProductByName(@PathVariable String name) {
        List<Product> products = productService.getProductsByName(name);
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("/product/by-brand")
    public ResponseEntity<APIResponse> findProductByBrand(@RequestParam String brand) {

        List<Product> products = productService.getProductsByBrand(brand);
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("/product/{category}/all/products")
    public ResponseEntity<APIResponse> findProductByCategory(@PathVariable String category) {
        List<Product> products = productService.getProductsByCategory(category);
        List<ProductDto> convertedProducts = productService.convertDTOList(products);
        return ResponseUtils.ok(convertedProducts);
    }

    @GetMapping("/product/count/by-brand/and-name")
    public ResponseEntity<APIResponse> countProductsByBrandAndName(@RequestParam String brand, @RequestParam String name) {
        var productCount = productService.countProductsByBrandAndName(brand, name);
        return ResponseUtils.ok(productCount);
    }
    
}

package com.sparta.week01_2_naver.controller;

import com.sparta.week01_2_naver.domain.Product;
import com.sparta.week01_2_naver.domain.ProductRepository;
import com.sparta.week01_2_naver.dto.ProductMypriceRequestDto;
import com.sparta.week01_2_naver.dto.ProductRequestDto;
import com.sparta.week01_2_naver.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductRestController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto productRequestDto){
        Product product = new Product(productRequestDto);
        return productRepository.save(product);
    }
    @PutMapping("api/products/{id}")
    public Long updatePrice(@PathVariable Long id, @RequestBody ProductMypriceRequestDto productMypriceRequestDto){
        return productService.update(id,productMypriceRequestDto);
    }
}

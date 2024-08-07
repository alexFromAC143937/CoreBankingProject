package com.bank.coresystem.service;

import com.bank.coresystem.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProductsAll();
    List<ProductDto> getAllProductsByLimit(int minLimit,  int maxLimit);
}
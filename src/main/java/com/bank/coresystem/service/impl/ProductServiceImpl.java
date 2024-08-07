package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.ProductDto;
import com.bank.coresystem.mapper.ProductMapper;
import com.bank.coresystem.repository.ProductRepository;
import com.bank.coresystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getProductsAll() {
        return productMapper.productToProductsDto(productRepository.findAll());
    }

    @Override
    public List<ProductDto> getAllProductsByLimit(int minLimit, int maxLimit) {
        return productMapper.productToProductsDto(
                productRepository.getAllProductsByLimit(minLimit, maxLimit));
    }
}
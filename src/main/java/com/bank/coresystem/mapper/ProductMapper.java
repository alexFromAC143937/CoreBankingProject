package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.ProductDto;
import com.bank.coresystem.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<ProductDto> productToProductsDto(List<Product> products);
}
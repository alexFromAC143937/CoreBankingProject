package com.bank.coresystem.controller;

import com.bank.coresystem.dto.ProductDto;
import com.bank.coresystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cbs/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDto> getProductsAll() {
        return productService.getProductsAll();
    }

    @GetMapping("/byLimit/min={minLimit}&max={maxLimit}")
    @ResponseStatus(HttpStatus.OK)

    public List<ProductDto> getActiveProducts(@PathVariable int minLimit,
                                              @PathVariable int maxLimit) {
        return productService.getAllProductsByLimit(minLimit, maxLimit);
    }
}
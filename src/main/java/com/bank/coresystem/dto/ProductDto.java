package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.CurrencyType;
import com.bank.coresystem.entity.enums.ProductStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Value
public class ProductDto {
    int id;
    String name;
    ProductStatus status;
    CurrencyType currency;
    BigDecimal interestRate;
    int limit;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;
}
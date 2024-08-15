package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.AgreementStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Value
public class AgreementDto {
    int id;
    AgreementStatus status;
    BigDecimal interestRate;
    BigDecimal sum;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;
    ProductDto product;
}
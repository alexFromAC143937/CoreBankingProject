package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.AgreementStatus;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Value
public class AgreementDto {
    int id;
    AgreementStatus status;
    BigDecimal interestRate;
    Timestamp createdAt;
    Timestamp updatedAt;
    AccountDto account;
    ProductDto product;
}
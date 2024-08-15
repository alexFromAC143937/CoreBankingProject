package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.AccountStatus;
import com.bank.coresystem.entity.enums.AccountType;
import com.bank.coresystem.entity.enums.CurrencyType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Value
public class AccountDto {
    UUID id;
    String name;
    AccountType type;
    AccountStatus status;
    BigDecimal balance;
    CurrencyType currency;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;
    Set<AgreementDto> agreements;
}
package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.AccountStatus;
import com.bank.coresystem.entity.enums.AccountType;
import com.bank.coresystem.entity.enums.CurrencyType;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Value
public class AccountDto {
    UUID id;
    String name;
    AccountType type;
    AccountStatus status;
    BigDecimal balance;
    CurrencyType currency;
    Timestamp createdAt;
    Timestamp updatedAt;
}
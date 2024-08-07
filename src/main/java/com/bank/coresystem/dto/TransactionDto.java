package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.TransactionType;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Value
public class TransactionDto {
      UUID id;
      AccountDto debitAccountId;
      AccountDto creditAccountId;
      TransactionType type;
      BigDecimal amount;
      String description;
      Timestamp createdAt;
}
package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonFormat;
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
      @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
      Timestamp createdAt;
}
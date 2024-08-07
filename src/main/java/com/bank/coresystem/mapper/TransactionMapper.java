package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.TransactionDto;
import com.bank.coresystem.entity.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    List<TransactionDto> transactionToTransactionDto(List<Transaction> transactions);
}
package com.bank.coresystem.service;

import com.bank.coresystem.dto.AgreementDto;
import com.bank.coresystem.dto.TransactionDto;

import java.util.List;

public interface TransactionService {
    List<TransactionDto> getTransactionAll();
}
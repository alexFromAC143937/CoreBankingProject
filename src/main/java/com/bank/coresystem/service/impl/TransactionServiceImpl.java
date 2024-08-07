package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.TransactionDto;
import com.bank.coresystem.mapper.TransactionMapper;
import com.bank.coresystem.repository.TransactionRepository;
import com.bank.coresystem.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;
    @Override
    public List<TransactionDto> getTransactionAll() {
        return transactionMapper.transactionToTransactionDto(transactionRepository.findAll());
    }
}
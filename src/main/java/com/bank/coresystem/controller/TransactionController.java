package com.bank.coresystem.controller;

import com.bank.coresystem.dto.TransactionDto;
import com.bank.coresystem.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cbs/transaction")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<TransactionDto> getTransactionsAll() {
        return transactionService.getTransactionAll();
    }
}
package com.bank.coresystem.controller;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cbs/account")
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AccountDto> getAccountsAll() {
        return accountService.getAccountAll();
    }
}
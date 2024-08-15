package com.bank.coresystem.controller;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getAccountById/{uuid}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountById(@PathVariable @Valid @UUID String uuid) {
        return accountService.getAccountById(uuid);
    }
}
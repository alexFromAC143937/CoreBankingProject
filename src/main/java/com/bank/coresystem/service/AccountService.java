package com.bank.coresystem.service;

import com.bank.coresystem.dto.AccountDto;

import java.util.List;

public interface AccountService {
    List<AccountDto> getAccountAll();
}
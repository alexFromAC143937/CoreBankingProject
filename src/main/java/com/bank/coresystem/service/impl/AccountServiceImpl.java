package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.mapper.AccountMapper;
import com.bank.coresystem.repository.AccountRepository;
import com.bank.coresystem.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public List<AccountDto> getAccountAll() {
        return accountMapper.getAccountsToAccountsDto(accountRepository.findAll());
    }
}
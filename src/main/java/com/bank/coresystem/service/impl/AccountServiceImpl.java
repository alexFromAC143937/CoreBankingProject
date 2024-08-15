package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.exception.ElementNotFindException;
import com.bank.coresystem.exception.ErrorMessage;
import com.bank.coresystem.mapper.AccountMapper;
import com.bank.coresystem.repository.AccountRepository;
import com.bank.coresystem.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public List<AccountDto> getAccountAll() {
        return accountMapper.getAccountsToAccountsDto(accountRepository.findAll());
    }

    @Override
    public AccountDto getAccountById(String uuid) {
        return accountMapper.toDto(accountRepository
                .findById(UUID.fromString(uuid))
                .orElseThrow(()-> new ElementNotFindException(ErrorMessage.M_ACCOUNT_NOT_FOUND)));
    }
}
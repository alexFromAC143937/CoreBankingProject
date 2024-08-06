package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.entity.Account;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface AccountMapper {
    List<AccountDto> getAccountsToAccountsDto(List<Account> list);
}
package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.AccountDto;
import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.entity.Account;
import com.bank.coresystem.entity.Manager;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface AccountMapper {
    List<AccountDto> getAccountsToAccountsDto(List<Account> list);
    AccountDto toDto(Account account);
}
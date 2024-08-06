package com.bank.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum DictionaryEnums {
    AccountStatus(1)
    ,AccountType(2)
    ,AgreementStatus(3)
    ,ClientStatus(4)
    ,CurrencyType(5)
    ,ManagerStatus(6)
    ,ProductStatus(7)
    ,TransactionType(8);
    private final int value;
}
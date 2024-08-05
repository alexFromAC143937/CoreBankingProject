package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

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
    DictionaryEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
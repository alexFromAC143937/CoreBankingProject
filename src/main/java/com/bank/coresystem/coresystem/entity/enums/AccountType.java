package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum AccountType {
    CREDIT(1),
    DEPOSIT(2),
    CURRENT(3);
    private final int value;

    AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
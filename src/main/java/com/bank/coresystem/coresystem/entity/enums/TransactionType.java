package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum TransactionType {
    NEW(1),
    PENDING(2),
    APPROVED(3);
    private final int value;

    TransactionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
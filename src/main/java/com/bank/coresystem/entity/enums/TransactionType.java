package com.bank.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionType {
    NEW(1),
    PENDING(2),
    APPROVED(3);
    private final int value;
}
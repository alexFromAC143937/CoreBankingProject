package com.bank.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AgreementStatus {
    ACTIVE(1),
    PENDING(2),
    BLOCKED(3),
    REMOVED(4);
    private final int value;
}
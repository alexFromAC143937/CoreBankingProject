package com.bank.coresystem.coresystem.entity.enums;
import java.util.ArrayList;
import java.util.List;

public enum AgreementStatus {
    ACTIVE(1),
    PENDING(2),
    BLOCKED(3),
    REMOVED(4);
    private final int value;

    AgreementStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
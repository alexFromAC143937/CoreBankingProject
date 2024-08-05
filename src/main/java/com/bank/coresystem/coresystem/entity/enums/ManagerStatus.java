package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum ManagerStatus {
    ACTIVE(0),
    PENDING(1),
    REMOVED(2);
    private final int value;

    ManagerStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
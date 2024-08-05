package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum ProductStatus {
    ACTIVE(1),
    PENDING(2),
    REMOVED(3);
    private final int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
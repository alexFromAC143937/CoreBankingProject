package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum CurrencyType {
    EUR(1),
    USD(2),
    UAH(3),
    RUB(4),
    BTC(5);

    private final int value;

    CurrencyType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
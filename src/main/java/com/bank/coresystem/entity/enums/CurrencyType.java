package com.bank.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CurrencyType {
    EUR(1),
    USD(2),
    UAH(3),
    RUB(4),
    BTC(5);

    private final int value;
}
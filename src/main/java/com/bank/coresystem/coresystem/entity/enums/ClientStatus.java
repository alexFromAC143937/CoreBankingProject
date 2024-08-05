package com.bank.coresystem.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum ClientStatus {
    ACTIVE(1),
    PENDING(2),
    REMOVED(3),
    BLOCKED(4);
    private final int value;

}
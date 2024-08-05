package com.bank.coresystem.coresystem.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ManagerStatus {
    ACTIVE(0),
    PENDING(1),
    REMOVED(2);
    private final int value;
}
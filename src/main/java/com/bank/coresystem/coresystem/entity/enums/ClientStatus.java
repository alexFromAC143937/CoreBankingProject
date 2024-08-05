package com.bank.coresystem.coresystem.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum ClientStatus {
    ACTIVE(1),
    PENDING(2),
    REMOVED(3),
    BLOCKED(4);
    private final int value;
    ClientStatus(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
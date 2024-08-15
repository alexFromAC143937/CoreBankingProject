package com.bank.coresystem.dto;

import lombok.Value;
@Value
public class ExceptionBaseStructure {
    String message;
    String codeError;
}
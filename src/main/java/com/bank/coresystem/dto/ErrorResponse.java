package com.bank.coresystem.dto;

import lombok.Value;

import java.util.List;

@Value
public class ErrorResponse {
    String errorCode;
    List<ExceptionBaseStructure> exceptionBaseStructures;
}
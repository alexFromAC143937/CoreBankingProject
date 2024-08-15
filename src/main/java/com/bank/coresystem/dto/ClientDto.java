package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.ClientStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Value
public class ClientDto {
    UUID id;
    ClientStatus status;
    String taxCode;
    String firstName;
    String lastName;
    String email;
    String address;
    String phone;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;
    Set<AccountDto> accounts;
}
package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.ClientStatus;
import lombok.Value;

import java.sql.Timestamp;
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
    Timestamp createdAt;
    Timestamp updatedAt;
}
package com.bank.coresystem.dto;

import com.bank.coresystem.entity.enums.ManagerStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class ManagerDto {
    int id;
    @NotNull
    @Size(min=2, max=10)
    String firstName;
    @NotNull
    @Size(min=2, max=10)
    String lastName;
    ManagerStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;
}
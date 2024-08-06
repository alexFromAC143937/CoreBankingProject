package com.bank.coresystem.service;

import com.bank.coresystem.dto.ClientDto;

import java.util.List;

public interface ClientService {
    List<ClientDto> getClientAll();
}
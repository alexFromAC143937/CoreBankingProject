package com.bank.coresystem.coresystem.service.impl;

import com.bank.coresystem.coresystem.dto.ClientDto;
import com.bank.coresystem.coresystem.mapper.ClientMapper;
import com.bank.coresystem.coresystem.repository.ClientRepository;
import com.bank.coresystem.coresystem.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientDto> getClientAll() {
        return clientMapper.clientsToClientsDto(clientRepository.findAll());
    }
}
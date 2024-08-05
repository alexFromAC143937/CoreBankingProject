package com.bank.coresystem.coresystem.controller;

import com.bank.coresystem.coresystem.dto.ClientDto;
import com.bank.coresystem.coresystem.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/client/all")
    @ResponseStatus(HttpStatus.OK)

    public List<ClientDto> getAccountsAll() {
        return clientService.getClientAll();
    }
}
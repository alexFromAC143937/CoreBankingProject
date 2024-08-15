package com.bank.coresystem.controller;

import com.bank.coresystem.dto.ClientDto;
import com.bank.coresystem.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cbs/client")
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)

    public List<ClientDto> getAccountsAll() {
        return clientService.getClientAll();
    }

    @GetMapping("/getClientsWhereAgreementAmountMoreThen/{sumAgreement}")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDto> getClientsWhereAgreementAmountMoreThen(@PathVariable int sumAgreement) {
        return clientService.getClientsWhereAgreementAmountMoreThen(sumAgreement);
    }
}
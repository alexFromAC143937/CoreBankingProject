package com.bank.coresystem.controller;

import com.bank.coresystem.dto.AgreementDto;
import com.bank.coresystem.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cbs/agreement")
public class AgreementController {
    private final AgreementService agreementService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AgreementDto> getAccountsAll() {
        return agreementService.getAgreementAll();
    }
}
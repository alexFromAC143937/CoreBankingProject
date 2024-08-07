package com.bank.coresystem.service;

import com.bank.coresystem.dto.AgreementDto;

import java.util.List;

public interface AgreementService {
    List<AgreementDto> getAgreementAll();
}
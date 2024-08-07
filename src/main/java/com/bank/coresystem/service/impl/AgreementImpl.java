package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.AgreementDto;
import com.bank.coresystem.mapper.AgreementMapper;
import com.bank.coresystem.repository.AgreementRepository;
import com.bank.coresystem.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AgreementImpl implements AgreementService {
    private final AgreementRepository agreementRepository;
    private final AgreementMapper agreementMapper;
    @Override
    public List<AgreementDto> getAgreementAll() {
        return agreementMapper.agreementsToAgreementsDto(agreementRepository.findAll());
    }
}
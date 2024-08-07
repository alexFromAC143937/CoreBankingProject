package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.AgreementDto;
import com.bank.coresystem.entity.Agreement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgreementMapper {
    List<AgreementDto> agreementsToAgreementsDto(List<Agreement> agreements);
}
package com.bank.coresystem.service;

import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.dto.responseDto.IdIntegerDto;

import java.util.List;

public interface ManagerService {
    List<ManagerDto> getAll();
    ManagerDto getById(Integer id);
    ManagerDto create(ManagerDto managerDto);
    ManagerDto update(Integer id, ManagerDto managerDto);
    IdIntegerDto delete(Integer id);
}
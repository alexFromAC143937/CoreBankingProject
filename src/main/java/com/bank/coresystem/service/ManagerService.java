package com.bank.coresystem.service;

import com.bank.coresystem.dto.ManagerCreateDto;
import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.dto.responceDto.IdIntegerDto;

import java.util.List;

public interface ManagerService {
    List<ManagerDto> getAll();
    ManagerDto getById(Integer id);
    ManagerDto create(ManagerCreateDto managerCreateDto);
    ManagerDto update(Integer id, ManagerCreateDto managerCreateDto);
    IdIntegerDto delete(Integer id);
}
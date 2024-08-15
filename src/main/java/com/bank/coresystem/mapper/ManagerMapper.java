package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.entity.Manager;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagerMapper{
    List<ManagerDto> managersToManagersDto(List<Manager> managers);
    Manager dToEntity(ManagerDto managerDto);
    ManagerDto toDto(Manager manager);
}
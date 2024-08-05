package com.bank.coresystem.coresystem.mapper;

import com.bank.coresystem.coresystem.dto.ClientDto;
import com.bank.coresystem.coresystem.entity.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    List<ClientDto> clientsToClientsDto(List<Client> clients);
}
package com.bank.coresystem.mapper;

import com.bank.coresystem.dto.ClientDto;
import com.bank.coresystem.entity.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    List<ClientDto> clientsToClientsDto(List<Client> clients);
}
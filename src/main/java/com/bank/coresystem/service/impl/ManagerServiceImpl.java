package com.bank.coresystem.service.impl;

import com.bank.coresystem.dto.ManagerCreateDto;
import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.dto.responceDto.IdIntegerDto;
import com.bank.coresystem.entity.Manager;
import com.bank.coresystem.entity.enums.ManagerStatus;
import com.bank.coresystem.mapper.ManagerMapper;
import com.bank.coresystem.repository.ManagerRepository;
import com.bank.coresystem.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Override
    public ManagerDto create(ManagerCreateDto managerCreateDto) {
        Manager manager = managerMapper.dToEntity(managerCreateDto);
        manager.setStatus(ManagerStatus.PENDING);
        return managerMapper.toDto(managerRepository.save(manager));
    }
    @Override
    public ManagerDto update(Integer id, ManagerCreateDto managerCreateDto){
        managerRepository
                .findById(id)
                .ifPresent(manager -> {
                    manager.setFirstName(managerCreateDto.getFirstName());
                    manager.setLastName(managerCreateDto.getLastName());
                    managerRepository.save(manager);
                });
        return getById(id);
    }
    @Override
    public IdIntegerDto delete(Integer id) {
        getById(id);
        managerRepository.deleteById(id);
        return new IdIntegerDto(id);
    }
    @Override
    public List<ManagerDto> getAll(){
        return  managerMapper.managersToManagersDto(
                managerRepository.findAll());
    }
    @Override
    public ManagerDto getById(Integer id) {
        return managerMapper.toDto(managerRepository.findById(id).orElseThrow(() -> new RuntimeException("Error")));
    }
}
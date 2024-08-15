package com.bank.coresystem.controller;

import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.dto.responseDto.IdIntegerDto;
import com.bank.coresystem.service.ManagerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/cbs/manager")
public class ManagerController{
    private final ManagerService managerService;

    @PostMapping("/createManager")
    @ResponseStatus(HttpStatus.OK)
    public ManagerDto create(@Valid @RequestBody ManagerDto managerDto){
        return managerService.create(managerDto);
    }

    @PutMapping(value = "/updateManager/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ManagerDto update(@PathVariable int id, @Valid @RequestBody ManagerDto managerDto){
        return managerService.update(id, managerDto);
    }

    @DeleteMapping("/deleteManager/{id}")
    @ResponseStatus(HttpStatus.OK)
    public IdIntegerDto delete(@PathVariable Integer id){
        return managerService.delete(id);
    }

    @GetMapping("/getManagerById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ManagerDto getById(@PathVariable Integer id) {
        return managerService.getById(id);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ManagerDto> getAll() {
        return managerService.getAll();
    }
}
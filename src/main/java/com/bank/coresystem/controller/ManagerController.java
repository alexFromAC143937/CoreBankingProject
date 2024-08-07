package com.bank.coresystem.controller;

import com.bank.coresystem.dto.ManagerCreateDto;
import com.bank.coresystem.dto.ManagerDto;
import com.bank.coresystem.dto.responceDto.IdIntegerDto;
import com.bank.coresystem.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cbs/manager")
public class ManagerController{
    private final ManagerService managerService;

    @PostMapping("/createManager")
    @ResponseStatus(HttpStatus.OK)
    public ManagerDto create(@RequestBody ManagerCreateDto managerCreateDto){
        return managerService.create(managerCreateDto);
    }

    @PutMapping(value = "/updateManager/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ManagerDto update(@PathVariable int id, @RequestBody ManagerCreateDto managerCreateDto){
        return managerService.update(id, managerCreateDto);
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
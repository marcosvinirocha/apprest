package com.marcos.apprest.controllers;

import java.util.List;

import com.marcos.apprest.domain.Funcionario;
import com.marcos.apprest.services.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResource {
    @Autowired
    private FuncionarioService service;

    @GetMapping()
    public @ResponseBody List<Funcionario> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "{/id}")
    public @ResponseBody Funcionario findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PostMapping(value = "{/id}")
    public @ResponseBody Funcionario save(@RequestBody Funcionario empresa) {
        return service.save(empresa);
    }

    @DeleteMapping(value = "{/id}")
    public void deleteById(@PathVariable(name = "/{id}") Long id) {
        service.deleteById(id);
    }
}

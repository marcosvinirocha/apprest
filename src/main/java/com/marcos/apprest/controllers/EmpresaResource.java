package com.marcos.apprest.controllers;

import java.util.List;

import com.marcos.apprest.domain.Empresa;
import com.marcos.apprest.services.EmpresaService;

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
@RequestMapping("/empresas")
public class EmpresaResource {
    @Autowired
    private EmpresaService service;

    @GetMapping()
    public @ResponseBody List<Empresa> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "{/id}")
    public @ResponseBody Empresa findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PostMapping(value = "{/id}")
    public @ResponseBody Empresa save(@RequestBody Empresa empresa) {
        return service.save(empresa);
    }

    @DeleteMapping(value = "{/id}")
    public void deleteById(@PathVariable(name = "/{id}") Long id) {
        service.deleteById(id);
    }
}

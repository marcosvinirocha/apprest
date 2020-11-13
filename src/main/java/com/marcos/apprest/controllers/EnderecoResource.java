package com.marcos.apprest.controllers;

import java.util.List;

import com.marcos.apprest.domain.Endereco;
import com.marcos.apprest.services.EnderecoService;

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
@RequestMapping("/enderecos")
public class EnderecoResource {
    @Autowired
    private EnderecoService service;

    @GetMapping()
    public @ResponseBody List<Endereco> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "{/id}")
    public @ResponseBody Endereco findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PostMapping(value = "{/id}")
    public @ResponseBody Endereco save(@RequestBody Endereco endereco) {
        return service.save(endereco);
    }

    @DeleteMapping(value = "{/id}")
    public void deleteById(@PathVariable(name = "/{id}") Long id) {
        service.deleteById(id);
    }

}

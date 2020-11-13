package com.marcos.apprest.services;

import java.util.List;

import javax.transaction.Transactional;

import com.marcos.apprest.domain.Empresa;
import com.marcos.apprest.repositories.EmpresaRepositoryJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepositoryJPA repository;

    @Transactional()
    public List<Empresa> findAll() {
        return repository.findAll();
    }

    @Transactional()
    public Empresa findById(Long id) {
        return repository.findById(id).get();
    }

    @Transactional()
    public Empresa save(Empresa funcionario) {
        return repository.save(funcionario);
    }

    @Transactional()
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

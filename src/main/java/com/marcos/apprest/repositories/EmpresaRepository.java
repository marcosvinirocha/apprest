package com.marcos.apprest.repositories;

import java.util.List;

import javax.sql.DataSource;

import com.marcos.apprest.domain.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpresaRepository {
    @Autowired
    private EmpresaRepositoryJPA repository;

    @Autowired
    private DataSource dataSource;

    public List<Empresa> findAll() {
        return repository.findAll();
    }

    public Empresa findById(Long id) {
        return repository.findById(id).get();
    }

    public Empresa save(Empresa empresa) {
        return repository.save(empresa);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

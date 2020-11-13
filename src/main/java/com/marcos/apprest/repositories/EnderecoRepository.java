package com.marcos.apprest.repositories;

import java.util.List;

import javax.sql.DataSource;

import com.marcos.apprest.domain.Endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EnderecoRepository {
    @Autowired
    private EnderecoRepositoryJPA repository;

    @Autowired
    private DataSource dataSource;

    public List<Endereco> findAll() {
        return repository.findAll();
    }

    public Endereco findById(Long id) {
        return repository.findById(id).get();
    }

    public Endereco save(Endereco endereco) {
        return repository.save(endereco);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

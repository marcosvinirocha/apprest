package com.marcos.apprest.repositories;

import java.util.List;

import javax.sql.DataSource;

import com.marcos.apprest.domain.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionariosRepository {
    @Autowired
    private FuncionariosRepositoryJPA repositoryJPA;

    @Autowired
    private DataSource dataSource;

    public List<Funcionario> findAll() {
        return repositoryJPA.findAll();
    }

    public Funcionario findById(Long id) {
        return repositoryJPA.findById(id).get();
    }

    public Funcionario save(Funcionario funcionario) {
        return repositoryJPA.save(funcionario);
    }

    public void deleteById(Long id) {
        repositoryJPA.deleteById(id);
    }
}

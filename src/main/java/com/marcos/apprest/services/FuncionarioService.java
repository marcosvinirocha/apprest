package com.marcos.apprest.services;

import java.util.List;

import javax.transaction.Transactional;

import com.marcos.apprest.domain.Funcionario;
import com.marcos.apprest.repositories.FuncionariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionariosRepository repository;

    @Transactional()
    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    @Transactional()
    public Funcionario findById(Long id) {
        return repository.findById(id);
    }

    @Transactional()
    public Funcionario save(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    @Transactional()
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

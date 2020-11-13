package com.marcos.apprest.services;

import java.util.List;

import javax.transaction.Transactional;

import com.marcos.apprest.domain.Endereco;
import com.marcos.apprest.repositories.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    @Transactional()
    public List<Endereco> findAll() {
        return repository.findAll();
    }

    @Transactional()
    public Endereco findById(Long id) {
        return repository.findById(id);
    }

    @Transactional()
    public Endereco save(Endereco endereco) {
        return repository.save(endereco);
    }

    @Transactional()
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

package com.marcos.apprest.repositories;

import com.marcos.apprest.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositoryJPA extends JpaRepository<Endereco, Long> {

}

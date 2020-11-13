package com.marcos.apprest.repositories;

import com.marcos.apprest.domain.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepositoryJPA extends JpaRepository<Funcionario, Long> {

}

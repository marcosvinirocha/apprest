package com.marcos.apprest.repositories;

import com.marcos.apprest.domain.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositoryJPA extends JpaRepository<Empresa, Long> {

}

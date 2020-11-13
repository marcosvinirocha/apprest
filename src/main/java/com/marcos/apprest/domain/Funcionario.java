package com.marcos.apprest.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

@Entity
public class Funcionario extends RepresentationModel<Funcionario> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    private String cpf;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(id, funcionario.id) && Objects.equals(nome, funcionario.nome)
                && Objects.equals(cargo, funcionario.cargo) && Objects.equals(cpf, funcionario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cargo, cpf);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", cargo='" + getCargo() + "'" + ", cpf='"
                + getCpf() + "'" + "}";
    }

}

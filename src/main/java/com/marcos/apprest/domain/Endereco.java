package com.marcos.apprest.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

@Entity
public class Endereco extends RepresentationModel<Endereco> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cep;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Endereco)) {
            return false;
        }
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id) && Objects.equals(rua, endereco.rua)
                && Objects.equals(numero, endereco.numero) && Objects.equals(bairro, endereco.bairro)
                && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rua, numero, bairro, cep);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", rua='" + getRua() + "'" + ", numero='" + getNumero() + "'"
                + ", bairro='" + getBairro() + "'" + ", cep='" + getCep() + "'" + "}";
    }

}

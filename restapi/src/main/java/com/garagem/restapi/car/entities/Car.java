package com.garagem.restapi.car.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //indica que essa classe são entidades

public class Car {
    @Id //indica que o campo abaixo é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que o campo sera auto-incremento
    private int id;

    @Column(nullable = false) //defininos que o valor não pode ser nulos
    private int fabricante;

    @Column(nullable = false)
    private int cor;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false)
    private int opcionais;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private int status;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getFabricante() {
        return fabricante;
    }
    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }
    public int getCor() {
        return cor;
    }
    public void setCor(int cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getOpcionais() {
        return opcionais;
    }
    public void setOpcionais(int opcionais) {
        this.opcionais = opcionais;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    
}

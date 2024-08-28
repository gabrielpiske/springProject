package com.garagem.restapi.ano.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Ano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que o campo sera auto-incremento
    private int id;

    @Column(nullable = false) //defininos que o valor não pode ser nulos
    private int ano;

    @Column(nullable = false)
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
}

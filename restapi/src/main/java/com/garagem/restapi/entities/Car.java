package com.garagem.restapi.entities;

public class Car {
    private int id;
    private int fabricante;
    private int cor;
    private int ano;
    private int opcionais;
    private String cep;
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

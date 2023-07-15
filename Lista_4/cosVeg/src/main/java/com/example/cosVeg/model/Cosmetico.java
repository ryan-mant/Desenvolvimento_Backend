package com.example.cosVeg.model;

import java.math.BigDecimal;

public class Cosmetico {
    private String nome;
    private int id;
    private BigDecimal preco;

    public Cosmetico() {
    }

    public Cosmetico(String nome, int id, BigDecimal preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}

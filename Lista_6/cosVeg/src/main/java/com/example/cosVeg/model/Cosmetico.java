package com.example.cosVeg.model;

import java.math.BigDecimal;

public class Cosmetico {
    private String nome;
    private int id;
    private String descricao;

    private String imagem;

    private double preco;
    public Cosmetico() {
    }

    public Cosmetico(String nome, int id,String descricao, double preco, String imagem) {
        this.nome = nome;
        this.id = id;
        this.descricao =descricao;
        this.imagem = imagem;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}

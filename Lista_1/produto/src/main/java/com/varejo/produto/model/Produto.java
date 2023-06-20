package com.varejo.produto.model;

public class Produto {
    private double preco;
    private String nome;
    private int codigoDeBarras;

    public Produto() {
    }

    public Produto(double preco, String nome, int codigoDeBarras) {
        this.preco = preco;
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}

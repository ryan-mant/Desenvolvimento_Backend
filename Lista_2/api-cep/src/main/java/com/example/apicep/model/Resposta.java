package com.example.apicep.model;

import java.util.ArrayList;
import java.util.List;

public class Resposta {
    private List<Endereco> enderecos = new ArrayList<>();

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}

package com.example.salas.service;

import com.example.salas.model.Sala;
import com.example.salas.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.findAll();
    }
    public String update(Sala sala){
        return bancoDeDados.updateById(sala.getId(), sala.isEstaAlugada(), sala.getNomeLocatario());
    }
}

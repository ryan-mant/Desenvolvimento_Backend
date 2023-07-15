package com.example.salas.repository;

import com.example.salas.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    List<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1,false,""));
        salas.add(new Sala(2,true,"Rogério"));
        salas.add(new Sala(3,false,""));
        salas.add(new Sala(4,true,"Fernando"));
        salas.add(new Sala(5,true,"Amanda"));
        salas.add(new Sala(6,false,""));
        salas.add(new Sala(7,false,""));
        salas.add(new Sala(8,true,"Lana"));
    }

    public List<Sala> findAll(){
        return salas;
    }
    public String updateById(int id, boolean estaAlugada, String nomeLocatario) {
        for (Sala sala : salas){
            if (sala.isEstaAlugada() == false && sala.getId() == id){
                sala.setEstaAlugada(true);
                sala.setNomeLocatario(nomeLocatario);
                return "Sala de id " + sala.getId() + " foi atualiazada";
            }
            else if (id > 8 || id < 1){
                return "Sala inexistente";
            }
        }
        return "Sala já foi alugada";
    }
}

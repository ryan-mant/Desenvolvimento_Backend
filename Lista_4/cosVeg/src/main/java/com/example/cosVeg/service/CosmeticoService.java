package com.example.cosVeg.service;

import com.example.cosVeg.model.Cosmetico;
import com.example.cosVeg.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CosmeticoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Cosmetico> getAll(){
        return bancoDeDados.findAll();
    }
    public Cosmetico getById(int id){
        List<Cosmetico> cosmeticos = bancoDeDados.findAll();
        for (Cosmetico cosmetico : cosmeticos){
            if (cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }

    public String save(Cosmetico cosmetico){
        return bancoDeDados.save(cosmetico);
    }
    public String delete(int id){
        return bancoDeDados.delete(id);
    }

}

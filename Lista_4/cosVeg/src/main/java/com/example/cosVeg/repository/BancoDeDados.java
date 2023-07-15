package com.example.cosVeg.repository;

import com.example.cosVeg.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados() {
        cosmeticos.add(new Cosmetico("Mascara Facial", 1,new BigDecimal(19.90)));
        cosmeticos.add(new Cosmetico("Hidratante Natural", 2,new BigDecimal(63.90)));
        cosmeticos.add(new Cosmetico("Xampu Com Carvão Ativo", 3,new BigDecimal(39.99)));
        cosmeticos.add(new Cosmetico("Loção Corporal", 4,new BigDecimal(29.49)));
    }
    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmetico1: cosmeticos){
            if (cosmetico.getId() == cosmetico1.getId()){
                return "cosmetico ja foi adicionado";
            }
        }cosmeticos.add(cosmetico);
        return "Cosmetico " + cosmetico.getNome() + " foi adicionado";
    }
    public String delete(int id){
        for (Cosmetico cosmetico: cosmeticos){
            if (cosmetico.getId() == id){
                cosmeticos.remove(cosmetico);
                return "Cosmetico " + cosmetico.getNome() + " foi removido com sucesso";
            }
        }
        return "Cosmetico não foi encontrado";
    }
}

package com.example.lojagames.controller;


import com.example.lojagames.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    private List<Jogo> jogos = new ArrayList<>();
    public JogoController(){
        jogos.add(new Jogo(1, "Street Fighter", 59.99));
        jogos.add(new Jogo(2, "Elden Ring", 79.99));
        jogos.add(new Jogo(3, "Euro Truck Simulator", 19.99));
        jogos.add(new Jogo(4, "Outlast", 58.99));

    }

    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }

    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        for(Jogo jogo: jogos){
            if (jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }
    @GetMapping("/menor-preço")
    public Jogo getByMenorPreco(){
        double menorPreco = 999;
        int saveId = 0;
        for (Jogo jogo: jogos){
            if (jogo.getPreco() < menorPreco){
                menorPreco = jogo.getPreco();
                saveId = jogo.getId() - 1;
            }
        }
        return jogos.get(saveId);
    }
    @PostMapping
    public String save(@RequestBody Jogo jogo){
        for (int i = 0; i < jogos.size(); i++) {
            if(jogo.getId() == jogos.get(i).getId()){
                return "Jogo já foi adicionado";
            }
        }
        this.jogos.add(jogo);
        return "O jogo " + jogo.getNome() + " foi adicionado com sucesso!";
    }
}

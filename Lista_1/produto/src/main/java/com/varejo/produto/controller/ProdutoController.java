package com.varejo.produto.controller;

import com.varejo.produto.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController() {
        produtos.add(new Produto(4.99, "Leite Integral", 789610987));
        produtos.add(new Produto(7.99, "Amaciante 2L", 789610123));
        produtos.add(new Produto(1.25, "Suco em Pó Sabor Uva", 789610456));
    }

    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        for(Produto produto: produtos){
            if (produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String save(@RequestBody Produto produto){
        for (int i = 0; i < produtos.size(); i++) {
            if(produto.getCodigoDeBarras() == produtos.get(i).getCodigoDeBarras()){
                return "Produto já foi adicionado";
            }
        }
        this.produtos.add(produto);
        return "O produto " + produto.getNome() + " foi adicionado com sucesso!";
    }
}

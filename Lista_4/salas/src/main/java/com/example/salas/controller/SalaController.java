package com.example.salas.controller;

import com.example.salas.model.Sala;
import com.example.salas.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }
    @PutMapping
    public String update(@RequestBody Sala sala){
        return salaService.update(sala);
    }
}

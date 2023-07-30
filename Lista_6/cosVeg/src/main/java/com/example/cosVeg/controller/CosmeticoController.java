package com.example.cosVeg.controller;


import com.example.cosVeg.model.Cosmetico;
import com.example.cosVeg.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("*")
public class CosmeticoController {
    @Autowired
    private CosmeticoService cosmeticoService;

    @GetMapping
    public ResponseEntity<List<Cosmetico>> getAll(){
        List<Cosmetico> cosmeticos = cosmeticoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(cosmeticos);
    }

}

package com.teste.crudspring.controller;

import com.teste.crudspring.model.Corte;
import com.teste.crudspring.repository.CorteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cortes")
public class CorteController {

    private final CorteRepository corteRepository;

    public CorteController(CorteRepository corteRepository) {
        this.corteRepository = corteRepository;
    }
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Corte> listar() {
        return corteRepository.findAll();
    }
}

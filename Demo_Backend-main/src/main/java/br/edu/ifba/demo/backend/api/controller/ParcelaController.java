package br.edu.ifba.demo.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.model.ParcelaModel;
import br.edu.ifba.demo.backend.api.repository.ParcelaRepository;

@RestController
@RequestMapping("/parcelas")
public class ParcelaController {
    @Autowired
    private ParcelaRepository parcelaRepository;

    @GetMapping
    public List<ParcelaModel> listarParcelas() {
        return parcelaRepository.findAll();
    }

    @PostMapping
    public ParcelaModel criarParcela(@RequestBody ParcelaModel parcela) {
        return parcelaRepository.save(parcela);
    }
}
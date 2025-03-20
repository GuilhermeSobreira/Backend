package br.edu.ifba.demo.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.model.ContasModel;
import br.edu.ifba.demo.backend.api.repository.ContasRepository;

@RestController
@RequestMapping("/contas")
public class ContasController {
    @Autowired
    private ContasRepository contasRepository;

    @GetMapping
    public List<ContasModel> listarContas() {
        return contasRepository.findAll();
    }

    @PostMapping
    public ContasModel criarConta(@RequestBody ContasModel conta) {
        return contasRepository.save(conta);
    }
}

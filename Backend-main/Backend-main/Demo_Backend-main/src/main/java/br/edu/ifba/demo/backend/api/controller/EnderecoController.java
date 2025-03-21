package br.edu.ifba.demo.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.model.EnderecoModel;
import br.edu.ifba.demo.backend.api.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public List<EnderecoModel> listarEnderecos() {
        return enderecoRepository.findAll();
    }

    @PostMapping
    public EnderecoModel criarEndereco(@RequestBody EnderecoModel endereco) {
        return enderecoRepository.save(endereco);
    }
}

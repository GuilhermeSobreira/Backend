package br.edu.ifba.demo.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.model.TelefoneModel;
import br.edu.ifba.demo.backend.api.repository.TelefoneRepository;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {
    @Autowired
    private TelefoneRepository telefoneRepository;

    @GetMapping
    public List<TelefoneModel> listarTelefones() {
        return telefoneRepository.findAll();
    }

    @PostMapping
    public TelefoneModel criarTelefone(@RequestBody TelefoneModel telefone) {
        return telefoneRepository.save(telefone);
    }
}

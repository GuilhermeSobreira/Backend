package br.edu.ifba.demo.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ifba.demo.backend.api.model.CategoriaModel;
import br.edu.ifba.demo.repository.CategoriaRepository;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<CategoriaModel> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public CategoriaModel criarCategoria(@RequestBody CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }
}
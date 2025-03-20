package br.edu.ifba.demo.backend.api.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.CategoriaModel;

public class CategoriaDTO {
    private Long id;
    private String nome;
    private Timestamp createAt;

    public static CategoriaDTO converter(CategoriaModel categoriaModel) {
        var categoria = new CategoriaDTO();
        categoria.setId(categoriaModel.getId());
        categoria.setNome(categoriaModel.getNome());
        categoria.setCreateAt(categoriaModel.getCreateAt());
        return categoria;
    }

    public static List<CategoriaDTO> converter(List<CategoriaModel> categorias) {
        List<CategoriaDTO> list = new ArrayList<>();
        for (CategoriaModel model : categorias) {
            list.add(CategoriaDTO.converter(model));
        }
        return list;
    }

    public CategoriaDTO() {}

    public CategoriaDTO(Long id, String nome, Timestamp createAt) {
        this.id = id;
        this.nome = nome;
        this.createAt = createAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Timestamp getCreateAt() { return createAt; }
    public void setCreateAt(Timestamp createAt) { this.createAt = createAt; }
}

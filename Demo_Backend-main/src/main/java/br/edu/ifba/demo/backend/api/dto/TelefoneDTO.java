package br.edu.ifba.demo.backend.api.dto;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.TelefoneModel;

public class TelefoneDTO {
    private Long id;
    private String numero;
    private String tipo;
    
    public static TelefoneDTO converter(TelefoneModel telefoneModel) {
        var telefone = new TelefoneDTO();
        telefone.setId(telefoneModel.getId());
        telefone.setNumero(telefoneModel.getNumero_Telefone());
        telefone.setTipo(telefoneModel.getTipo());
        return telefone;
    }
    
    public static List<TelefoneDTO> converter(List<TelefoneModel> telefones) {
        List<TelefoneDTO> list = new ArrayList<>();
        for (TelefoneModel model : telefones) {
            list.add(TelefoneDTO.converter(model));
        }
        return list;
    }
    
    public TelefoneDTO() {}
    
    public TelefoneDTO(Long id, String numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }
    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
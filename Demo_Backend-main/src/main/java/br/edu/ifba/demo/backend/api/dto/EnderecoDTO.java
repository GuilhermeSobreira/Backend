package br.edu.ifba.demo.backend.api.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.EnderecoModel;

public class EnderecoDTO {
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private Timestamp createdAt;
    
    public static EnderecoDTO converter(EnderecoModel enderecoModel) {
        var endereco = new EnderecoDTO();
        endereco.setId(enderecoModel.getId());
        endereco.setRua(enderecoModel.getRua());
        endereco.setCidade(enderecoModel.getCidade());
        endereco.setEstado(enderecoModel.getEstado());
        endereco.setCep(enderecoModel.getCep());
        endereco.setCreatedAt(enderecoModel.getCreatedAt());
        return endereco;
    }
    
    public static List<EnderecoDTO> converter(List<EnderecoModel> enderecos) {
        List<EnderecoDTO> list = new ArrayList<>();
        for (EnderecoModel model : enderecos) {
            list.add(EnderecoDTO.converter(model));
        }
        return list;
    }
    
    public EnderecoDTO() {}
    
    public EnderecoDTO(Long id, String rua, String cidade, String estado, String cep, Timestamp createdAt) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.createdAt = createdAt;
    }
    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Object id) { this.id = (Long) id; }
    public String getRua() { return rua; }
    public void setRua(Object rua) { this.rua = (String) rua; }
    public String getCidade() { return cidade; }
    public void setCidade(Object cidade) { this.cidade = (String) cidade; }
    public String getEstado() { return estado; }
    public void setEstado(Object estado) { this.estado = (String) estado; }
    public String getCep() { return cep; }
    public void setCep(Object cep) { this.cep = (String) cep; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Object createdAt) { this.createdAt = (Timestamp) createdAt; }
}
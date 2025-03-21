package br.edu.ifba.demo.backend.api.dto;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.ContasModel;

public class ContasDTO {
    private Long id;
    private String descricao;
    private Double valor;
    private Timestamp createAt;

    public static ContasDTO converter(ContasModel contasModel) {
        var conta = new ContasDTO();
        conta.setId(contasModel.getId());
        conta.setDescricao(contasModel.getDescricao());
        conta.setValor(contasModel.getValor());
        conta.setCreateAt(contasModel.getCreateAt());
        return conta;
    }

    public static List<ContasDTO> converter(List<ContasModel> contas) {
        List<ContasDTO> list = new ArrayList<>();
        for (ContasModel model : contas) {
            list.add(ContasDTO.converter(model));
        }
        return list;
    }

    public ContasDTO() {}

    public ContasDTO(Long id, String descricao, Double valor, Timestamp createAt) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.createAt = createAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public Timestamp getCreateAt() { return createAt; }
    public void setCreateAt(Timestamp createAt) { this.createAt = createAt; }
}

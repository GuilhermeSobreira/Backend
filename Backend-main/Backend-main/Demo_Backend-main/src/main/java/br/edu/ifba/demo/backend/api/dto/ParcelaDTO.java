package br.edu.ifba.demo.backend.api.dto;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.ParcelaModel;

public class ParcelaDTO {
    private Long id;
    private BigDecimal valor;
    private Timestamp dataVencimento;
    private Boolean pago;
    
    public static ParcelaDTO converter(ParcelaModel parcelaModel) {
        var parcela = new ParcelaDTO();
        parcela.setId(parcelaModel.getId());
        parcela.setValor(parcelaModel.getValor());
        parcela.setDataVencimento(parcelaModel.getDataVencimento());
        parcela.setPago(parcelaModel.getPago());
        return parcela;
    }
    
    public static List<ParcelaDTO> converter(List<ParcelaModel> parcelas) {
        List<ParcelaDTO> list = new ArrayList<>();
        for (ParcelaModel model : parcelas) {
            list.add(ParcelaDTO.converter(model));
        }
        return list;
    }
    
    public ParcelaDTO() {}
    
    public ParcelaDTO(Long id, BigDecimal valor, Timestamp dataVencimento, Boolean pago) {
        this.id = id;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = pago;
    }
    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public Timestamp getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(Timestamp dataVencimento) { this.dataVencimento = dataVencimento; }
    public Boolean getPago() { return pago; }
    public void setPago(Boolean pago) { this.pago = pago; }
}

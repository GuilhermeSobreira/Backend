package br.edu.ifba.demo.backend.api.model;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ParcelaModel {

     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idParcela")
    private Long idParcela;
    
    @Column(name = "data_vencimento", nullable = true)
    private Date data_vencimento;

    @Column(name = "numero_parcela", nullable = true)
    private int numero_parcela;
    
    @Column(name = "valor_parcela", nullable = true)
    private Double valor_parcela;

    @Column(name = "status", nullable = true)
    private String status;

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public BigDecimal getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }

    public Timestamp getDataVencimento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimento'");
    }

    public Boolean getPago() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPago'");
    }
    
}

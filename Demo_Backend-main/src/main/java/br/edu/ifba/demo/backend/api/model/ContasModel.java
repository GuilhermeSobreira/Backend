package br.edu.ifba.demo.backend.api.model;

import lombok.Data;

import java.security.Timestamp;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "Endereco")
public class ContasModel {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idConta")
    private Long idConta;
    
    @Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "valor", nullable = false)
    private Double valor;
    
    @Column(name = "data_vencimento", nullable = true)
    private Date data_vencimento;

    @Column(name = "data_pagamento", nullable = true)
    private Date data_pagamento;
    
    @Column(name = "tipo_conta", nullable = true)
    private String tipo_conta;

    @Column(name = "status", nullable = true)
    private String status;

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public Timestamp getCreateAt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCreateAt'");
    }

}
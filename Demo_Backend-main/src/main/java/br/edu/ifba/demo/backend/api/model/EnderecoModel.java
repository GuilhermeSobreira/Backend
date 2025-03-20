package br.edu.ifba.demo.backend.api.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "Endereco")
public class EnderecoModel {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEndereco")
    private Long idEndereco;
    
    @Column(name = "rua_Endereco", nullable = false)
	private String rua_Endereco;

	@Column(name = "numero_Endereco", nullable = false)
    private String numero_Endereco;
    
    @Column(name = "cidade_Endereco", nullable = true)
    private String cidade_Endereco;
    
    @Column(name = "estado_Endereco", nullable = true)
    private Integer estado_Endereco;

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public Object getRua() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRua'");
    }

    public Object getCidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCidade'");
    }

    public Object getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }

    public Object getCep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCep'");
    }

    public Object getCreatedAt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCreatedAt'");
    }
}

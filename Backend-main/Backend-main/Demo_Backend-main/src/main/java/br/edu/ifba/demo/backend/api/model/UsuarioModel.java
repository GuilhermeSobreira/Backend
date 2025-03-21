package br.edu.ifba.demo.backend.api.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long idUsuario;
	
	@Column(name = "login", nullable = false, unique = true)
	private String login;
	
	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone", nullable = true)
	private String telefone;

	@Column(name = "endereco", nullable = true)
	private String endereco;
	
    
	
	public UsuarioModel() {
	}

	public UsuarioModel(Long id_usuario, String login, String senha, String email, String telefone, String endereco) {
		this.idUsuario = id_usuario;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

    public Timestamp getCreate_at() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCreate_at'");
    }

    public Timestamp getLastLogin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastLogin'");
    }

    public Timestamp getCreateAt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCreateAt'");
    }
}

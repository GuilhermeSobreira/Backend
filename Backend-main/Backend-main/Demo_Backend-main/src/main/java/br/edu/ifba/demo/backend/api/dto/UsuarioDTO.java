package br.edu.ifba.demo.backend.api.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.demo.backend.api.model.UsuarioModel;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Long idUsuario;
    private String login;
    private String senha;
    private Timestamp createAt;
    private Timestamp lastLogin;

    public static UsuarioDTO converter(UsuarioModel usuarioModel) {
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setIdUsuario(usuarioModel.getIdUsuario());
        usuario.setLogin(usuarioModel.getLogin());
        usuario.setSenha(usuarioModel.getSenha());
        usuario.setCreateAt(usuarioModel.getCreateAt());
        usuario.setLastLogin(usuarioModel.getLastLogin());
        return usuario;
    }

    public static List<UsuarioDTO> converter(List<UsuarioModel> usuarios) {
        List<UsuarioDTO> list = new ArrayList<>();
        for (UsuarioModel model : usuarios) {
            list.add(UsuarioDTO.converter(model));
        }
        return list;
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long idUsuario, String login, String senha) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
    }

    public UsuarioDTO(Long idUsuario, String login, String senha, Timestamp createAt, Timestamp lastLogin) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.createAt = createAt;
        this.lastLogin = lastLogin;
    }
}

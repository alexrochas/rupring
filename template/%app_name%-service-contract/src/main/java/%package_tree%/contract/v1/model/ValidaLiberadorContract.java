package br.com.dimed.liberador.contract.v1.model;

import lombok.Data;

@Data
public class ValidaLiberadorContract {
    private String usuario;
    private Integer filial;
    private String senha;
    private String tipoUsuario;
}

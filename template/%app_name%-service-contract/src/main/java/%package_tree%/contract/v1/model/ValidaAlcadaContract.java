package br.com.dimed.liberador.contract.v1.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ValidaAlcadaContract {

    private BigDecimal alcadaDisponivel;
    private Long codigoUsuario;
    private Long codigoItem;
    private BigDecimal valorMinimo;

}

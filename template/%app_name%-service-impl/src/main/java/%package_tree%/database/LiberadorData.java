package br.com.dimed.liberador.database;

import br.com.dimed.liberador.model.ValidaAlcadaModel;
import br.com.dimed.liberador.model.ValidaLiberadorModel;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

public interface LiberadorData {

    @Select(value="{ CALL #{alcadaDisponivel, jdbcType=DECIMAL, mode=OUT} := prophw.FNC_PHW_RETORNA_ALCADA_FUNC ("
            + "#{codigoUsuario, mode=IN, jdbcType=INTEGER},"
            + "#{codigoItem , mode=IN, jdbcType=INTEGER},"
            + "#{valorMinimo, mode=IN, jdbcType=DECIMAL})}")
    @Options(statementType = StatementType.CALLABLE)
    void validaAlcada(ValidaAlcadaModel validaAlcadaModel);

    @Select(value="{ CALL prophw.PRC_PHL_VALIDA_USERS ("
            + "#{filial, mode=IN, jdbcType=INTEGER},"
            + "#{usuario, mode=IN, jdbcType=VARCHAR},"
            + "#{senha, mode=IN, jdbcType=VARCHAR},"
            + "#{codigoUsuario, jdbcType=INTEGER, mode=OUT}, "
            + "#{usuarioCompleto, jdbcType=VARCHAR, mode=OUT}, "
            + "#{liberadorPharmawin, jdbcType=CHAR, mode=OUT}, "
            + "#{descontoMaximo, jdbcType=INTEGER, mode=OUT}, "
            + "#{funcionario, jdbcType=INTEGER, mode=OUT}, "
            + "#{erro, jdbcType=VARCHAR, mode=OUT},"
            + "#{tipoUsuario, mode=IN, jdbcType=VARCHAR}"
            + ") }")
    @Options(statementType = StatementType.CALLABLE)
    void validaLiberador(ValidaLiberadorModel validaAlcadaModel);
}


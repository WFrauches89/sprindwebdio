package com.meuscursos.spring_web.exceptions;

public class CamposObrigatoriosExceptions extends BusinessException{

    public CamposObrigatoriosExceptions(String campos) {
        super("O campo %s é obrigatório.", campos);
    }
}

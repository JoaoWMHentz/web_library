package org.joao.enums;

public enum ResponsesEnum {
    SUCCESSFULLY("OPERAÇÃO REALIZADA COM SUCESSO!"),
    ERRO("OCORREU UM ERRO AO REALIZAR A REQUISIÇÃO: "),
    ID_NOT_FOUND("ID NÃO ENCONTRADO!");
    private final String text;

    ResponsesEnum(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
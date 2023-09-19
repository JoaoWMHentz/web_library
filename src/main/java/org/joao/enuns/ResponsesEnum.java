package org.joao.enuns;

public enum ResponsesEnum {
    SUCCESSFULLY("OPERAÇÃO REALIZADA COM SUCESSO!"),
    ERRO("OCORREU UM ERRO AO REALIZAR A REQUISIÇÃO: ");

    private final String text;

    ResponsesEnum(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}

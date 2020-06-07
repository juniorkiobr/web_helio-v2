package com.company.projetoheliov2.models;

public enum tipoPagamentoEnum {
    DEBITO("Débito"),
    CREDITO("Crédito"),
    BOLETO("Boleto"),
    A_VISTA("À Vista"),
    ;

    private String valor;
    tipoPagamentoEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public tipoPagamentoEnum getTipoByValor(String valor){
        return tipoPagamentoEnum.valueOf(valor);
    }
}

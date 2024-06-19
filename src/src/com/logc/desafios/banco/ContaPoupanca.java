package com.logc.desafios.banco;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = AGENCIA_PADRAO;
        super.numero = "2" + SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        imprimirDados();
    }
}

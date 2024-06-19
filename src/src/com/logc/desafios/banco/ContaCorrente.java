package com.logc.desafios.banco;

public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super.agencia = AGENCIA_PADRAO;
        super.numero = "1" + SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        imprimirDados();
    }
}

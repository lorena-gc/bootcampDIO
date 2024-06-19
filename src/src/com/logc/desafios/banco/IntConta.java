package com.logc.desafios.banco;

public interface IntConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}

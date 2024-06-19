package com.logc.desafios.banco;

public abstract class Conta implements IntConta{

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected String numero;
    protected double saldo;

    protected Cliente cliente;



    public int getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insulficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDados() {
        System.out.println(String.format("Titular : %s", cliente.getNome()));
        System.out.println(String.format("Agencia : %d", agencia));
        System.out.println(String.format("Número: %s", numero));
        System.out.println(String.format("Saldo : %.2f", saldo));
    }
}

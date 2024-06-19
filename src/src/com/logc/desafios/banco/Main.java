package com.logc.desafios.banco;

public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente("Lorena",147258369);

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.imprimirExtrato();

        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

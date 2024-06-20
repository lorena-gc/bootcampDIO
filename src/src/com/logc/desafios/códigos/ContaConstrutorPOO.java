package com.logc.desafios.códigos;

import java.io.*;

public class ContaConstrutorPOO {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("conta-bancaria.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        double saldoInicial =  Double.parseDouble(br.readLine());
        ContaBancariaPOO conta = new ContaBancariaPOO(saldoInicial);

        double valorDeposito =  Double.parseDouble(br.readLine());
        conta.depositar(valorDeposito);

        double valorSaque =  Double.parseDouble(br.readLine());
        conta.sacar(valorSaque);
    }
}

class ContaBancariaPOO {
    private double saldo;

    public ContaBancariaPOO(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque feito.");
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}

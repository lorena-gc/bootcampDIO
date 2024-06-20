package com.logc.desafios.códigos;

import java.io.*;
import java.text.DecimalFormat;

public class HerancaBancaria {

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("heranca-bancaria.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String titular = br.readLine();
        int numeroConta = Integer.parseInt(br.readLine());
        double saldo = Double.parseDouble(br.readLine());
        double taxaJuros = Double.parseDouble(br.readLine());

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros +"%");
    }
}

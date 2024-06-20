package com.logc.desafios.códigos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroBancarioStreamAPI {
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("registro-bancario.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        double saldo = Double.parseDouble(br.readLine());
        int quantidadeTransacoes = Integer.parseInt(br.readLine());

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = br.readLine().charAt(0);

            double valorTransacao = Double.parseDouble(br.readLine());

            Transacao transacao = new Transacao(tipoTransacao,valorTransacao);

            transacoes.add(transacao);

            if (Character.toUpperCase(transacao.getTipo()) == 'D') {
                saldo += valorTransacao;
            } else if (Character.toUpperCase(transacao.getTipo()) == 'S') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

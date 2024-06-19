package com.logc.desafios.banco;

public class Cliente {

    private String nome;
    private int CPF;

    public Cliente(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }
}

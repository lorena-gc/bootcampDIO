package com.logc.desafios.designPatterns.strategy;

public class ComportamentoDefensifo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Se movendo defensivamente");
    }
}

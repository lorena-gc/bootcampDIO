package com.logc.desafios.designPatterns.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Se movendo agressivamente");
    }
}

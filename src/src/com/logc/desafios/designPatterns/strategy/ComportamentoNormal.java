package com.logc.desafios.designPatterns.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Se movendo normalmente");
    }
}

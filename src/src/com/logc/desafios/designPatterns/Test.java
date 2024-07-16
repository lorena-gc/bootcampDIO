package com.logc.desafios.designPatterns;

import com.logc.desafios.designPatterns.facade.Facade;
import com.logc.desafios.designPatterns.singleton.SingletonEager;
import com.logc.desafios.designPatterns.singleton.SingletonLazeHolder;
import com.logc.desafios.designPatterns.singleton.SingletonLazy;
import com.logc.desafios.designPatterns.strategy.*;

public class Test {

    public static void main(String[] args) {
        //Facade
        Facade facade = new Facade();
        facade.migrarClient("Lorena", "1330190");

        System.out.println("----------------------");

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensifo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        System.out.println("----------------------");

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazeHolder lazyHolder = SingletonLazeHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazeHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}

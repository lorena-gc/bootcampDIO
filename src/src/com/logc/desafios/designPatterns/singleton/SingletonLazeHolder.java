package com.logc.desafios.designPatterns.singleton;

/**
 * Singleton "apressado"
 */
public class SingletonLazeHolder {
    private static class Holder {
        public static SingletonLazeHolder instancia = new SingletonLazeHolder();
    }
    private SingletonLazeHolder(){

        super();
    }

    public static SingletonLazeHolder getInstancia() {

        return Holder.instancia;
    }
}

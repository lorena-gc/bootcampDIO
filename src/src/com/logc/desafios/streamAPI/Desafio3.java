package com.logc.desafios.streamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 3 - Verifique se todos os números da lista são positivos
 */
public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPositivos = numeros.stream()
                .filter(n -> n > 0)
                .toList();

        System.out.println("Os números positivos contidos na lista são: " + numerosPositivos);

    }
}

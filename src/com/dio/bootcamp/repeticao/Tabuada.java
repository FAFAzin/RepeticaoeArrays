package com.dio.bootcamp.repeticao;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ve a tabuada.
 * A saída deve se conforme o exemplo a baixo:
 *
 * tabuda de 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++ ){

            int valor = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + valor);
        }
    }
}

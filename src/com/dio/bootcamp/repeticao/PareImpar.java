package com.dio.bootcamp.repeticao;

/*
* Faça um programa que peça N números inteiros,
* calcule e mostre a quantidade de números pares
* e a quantidade de números impares.
* */

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         int quantNumeros;
         int numero = 0;
         int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();


        int count = 0;

        do {
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            System.out.println("Número: ");
            numero = scan.nextInt();
            count ++;

        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade ìmpares: " + quantImpares);
    }
}

package com.dio.bootcamp.repeticao;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * ex: 5! = 120.
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Digite o valor fatorial");
        fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i --) {

           multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}

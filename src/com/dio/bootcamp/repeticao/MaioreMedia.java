package com.dio.bootcamp.repeticao;
/*
 * Faça um programa que leia 5 números
 * e informa o maior número
 * e a média desses números
 * */

import java.util.Scanner;

public class MaioreMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma += numero;
            System.out.println("soma: " + soma);

            if (numero > maior) maior = numero;

            count += 1;
        } while (count < 5);

        System.out.println(" Maior: " + maior);
        System.out.println(" Média: " + soma/5);


    }
}

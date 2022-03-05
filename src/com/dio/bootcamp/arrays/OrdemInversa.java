package com.dio.bootcamp.arrays;

/**
 * Crie um vetor de seis números inteiros
 * e mostre-os n ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;
        System.out.println("\nvetor: ");

        while (count < (vetor.length -1)){
            System.out.println(vetor[count] + " ");
            count++;
        }

        for (int i = (vetor.length - 1); i >= 0; i -- ){
            System.out.println(vetor[i] + " ");


        }


    }

}

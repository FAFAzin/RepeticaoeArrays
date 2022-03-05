package com.dio.bootcamp.repeticao;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a idade.
 * (Pare inserindo o valor zero no campo)
 */
import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("nome");
            nome = scan.next();
            System.out.println("idade");
            if(nome.equals("0")) break;

            idade = scan.nextInt();

        }
        System.out.println("chegou aqui....jo");

    }


}

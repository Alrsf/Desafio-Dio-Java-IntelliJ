package Intermediario;

/* Faça um programa que leia 5 valores inteiros.
Conte quantos destes valores digitados são pares e mostre esta informação. */


import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();

            if (n % 2 == 0) { //condição que verifica se "n" é par, ou seja, se o resto da divisão de "n" por 2 é zero.
                quantidadePares++;
            }
        }
        System.out.printf("%d valores pares\n", quantidadePares);
    }
}
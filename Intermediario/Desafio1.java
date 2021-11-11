package Intermediario;

/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        int multAB = multAB(a, b);
        int multCD = multCD(c, d);
        int subtrair = subtrair(multAB,multCD);

        System.out.println("DIFERENCA = " + subtrair);  //complete
    }
    public static int multAB(int a, int b) {
        return a * b;
    }
    public static int multCD(int c, int d) {
        return c * d;
    }
    public static int subtrair(int multAB, int multCD) {
        return multAB - multCD;
    }
}
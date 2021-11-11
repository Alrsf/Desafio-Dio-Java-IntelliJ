package Intermediario;

/* Você trabalha para a polícia de Codham, em um reconhecido cargo de batprogramador
(profissão responsável por resolver problemas que envolvem o cavaleiro das trevas,
realizando a codificação de algoritmos) e lhe foi solicitado a seguinte tarefa:
dizer, para cada vilão, se ele alguma vez já foi capturado pelo cavaleiro das trevas. */

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        int viloesCapturados = 0;
        while(viloesCapturados < T) {
            String vilao = scan.next();

            System.out.println("Y"); //Imprima "Y" na linha abaixo, pois já temos o vilão em mãos ;-)
            viloesCapturados++;
        }

    }
}
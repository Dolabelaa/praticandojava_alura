/*
Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.

Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente?

Saída esperada:


O número 8 é par.

Ou


O número 7 é ímpar.
 */

public class Atividade1 {
    public static void main(String[] args) {

        int numero = 7;

        if(numero %2 == 0){
            System.out.println("Número par.");
        } else{
            System.out.println("Número ímpar.");
        }


    }
}
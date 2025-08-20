/*
Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número. Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.

Exemplo de entrada:

Digite um número: 5
Copiar código
Saída esperada:

O fatorial de 5 é: 120
 */

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, result=1;
        System.out.println("Me fale um número: ");
        numero = sc.nextInt();
        for(int i=1; i<=numero;i++){
            result *= i;
        }
        System.out.println("O fatorial de "+ numero + " é: "+ result);
    }
}

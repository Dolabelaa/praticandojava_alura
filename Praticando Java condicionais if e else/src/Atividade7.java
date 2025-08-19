/*
Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.

Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

Exemplo de entrada:

Digite o valor do empréstimo: 750
Copiar código
Saída esperada:

O valor 750, não está dentro do intervalo permitido para empréstimo.
 */


import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double valorDigitado;
        System.out.println("Me fale quanto quer de empréstimo: ");
        valorDigitado = sc.nextDouble();

        if(valorDigitado >= 1000 && valorDigitado <= 5000){
            System.out.println("o valor: " +valorDigitado + ", está dentro do intervalo de empréstimo.");
        }else{
            System.out.println("o valor: " +valorDigitado + ", não está dentro do intervalo permitido para empréstimo.");
        }
    }
}

/*
Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.

Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros, compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.

Exemplo de entrada:

Digite o primeiro número: 10
Digite o segundo número: 25

Saída esperada:

O maior número é 25.
 */

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero1,numero2;

        System.out.println("Me fale um número: ");
        numero1 = sc.nextInt();
        System.out.println("Me fale mais um número: ");
        numero2 = sc.nextInt();

        if(numero1 == numero2){
            System.out.println("Números iguais!");
        }else if(numero1 > numero2){
            System.out.println("Número "+numero1+" é maior que "+numero2);
        }else {
            System.out.println("Número: "+numero2+" é maior que "+numero1);
        }


    }
}

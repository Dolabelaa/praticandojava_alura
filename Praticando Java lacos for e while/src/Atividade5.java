/*
Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento. Crie um programa que receba uma lista de números e encontre o maior número.

Exemplo de entrada:

Digite os números separados por espaço: 3 7 2 9 5
Copiar código
Saída esperada:

O maior número é: 9
 */


import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}

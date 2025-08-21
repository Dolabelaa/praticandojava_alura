/*
Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos. Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e negativos existem em uma sequência de números fornecida por ela.

Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **

Exemplo de entrada:

Digite um número (ou 'fim' para encerrar): 3
Digite um número (ou 'fim' para encerrar): -1
Digite um número (ou 'fim' para encerrar): 7
Digite um número (ou 'fim' para encerrar): fim
Copiar código
Saída esperada:

Números positivos: 2
Números negativos: 1

 */

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroPositivo = 0, numeroNegativo=0;

        while(true){

            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = sc.nextLine();

            if (entrada.equals("fim")) {
                break;
            }
            int numero = Integer.parseInt(entrada);
            if(numero >= 0){
                numeroPositivo++;
            }else {
                numeroNegativo++;
            }
        }

        System.out.println("Números positivos: "+ numeroPositivo);
        System.out.println("Números negativos: "+ numeroNegativo);
    }
}

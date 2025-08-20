/*
João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

int[] valores = {10, 20, 30, 40, 50};
Copiar código
Crie um programa que ajude João a calcular o valor total.

Saída esperada:

A soma total das receitas é: 150
 */


public class Atividade2 {
    public static void main(String[] args){


        int vet[] = {10, 20, 30, 40, 50}, result=0;

        for (int i=0; i < vet.length; i++){
            result += vet[i];
        }
        System.out.println("A soma total das receitas: "+ result);
    }
}

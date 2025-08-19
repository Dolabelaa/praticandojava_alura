/*
Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.

Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.

Exemplo de entrada:

double valorReais = 451.50;

Saída esperada:

O valor em dólares é: US$ 86.0
 */

public class Atividade8 {
    public static void main(String[] args){

        double valorEmReais = 451.50;
        double taxaDeCambio = 5.25;
        double valorEmDolares = valorEmReais/taxaDeCambio;
        System.out.println("O valor em dolares é: " + valorEmDolares);

    }
}

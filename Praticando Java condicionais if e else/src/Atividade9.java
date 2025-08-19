/*
Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

Ter entre 18 e 65 anos.

Pesar mais de 50 kg.

Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.

Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

Exemplo de entrada:

Digite a idade do doador: 17
Digite o peso do doador (em kg): 55
Copiar código
Saída esperada:

O doador não é compatível.
Motivo: Deve ter entre 18 e 65 anos.
 */

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        double peso;

        System.out.println("Me informe a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Me informe seu peso: ");
        peso = sc.nextDouble();

        if(idade >= 18 && idade <= 65){
            if(peso > 50){
                System.out.println("O doador é compatível.");
            }else{
                System.out.println("O doador não é compatível.");
                System.out.println("Motivo: peso.");
            }
        }else{
            if(peso > 50){
                System.out.println("O doador não é compatível.");
                System.out.println("Motivo: idade");
            }else {
                System.out.println("O doador não é compatível.");
                System.out.println("Motivo: idade e peso");
            }
        }
    }
}

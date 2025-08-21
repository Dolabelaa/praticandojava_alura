/*
Um sistema de cadastro exige que os usuários informem um nome válido. No entanto, alguns usuários tentam deixar o campo em branco ou inserir nomes muito curtos. O sistema precisa garantir que o nome tenha pelo menos 3 caracteres antes de prosseguir com o cadastro.

Com base nesse cenário, crie um programa que continue pedindo um nome até que o usuário insira um valor válido com pelo menos 3 caracteres.

Exemplo de entrada:

Digite seu nome:
Nome inválido. Digite novamente.
Digite seu nome: A
Nome inválido. Digite novamente.
Digite seu nome: Ana
Copiar código
Saída esperada:

Nome "Ana" cadastrado com sucesso!
 */

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        do {
            System.out.println("Me responda o seu nome: ");
            nome = sc.nextLine();
            if(nome.length() >= 3){
                System.out.println("Nome "+nome+" cadastrado com sucesso!");
                break;
            }else{
                System.out.println("Nome inválido. Digite novamente.");
            }
        }while(nome.length() < 3);

    }


}

/*
João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

Um código de acesso numérico (o código correto é 2023).

Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).

O sistema só permitirá o acesso se:

O código de acesso estiver correto.

O nível de permissão for válido (1, 2 ou 3).

Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.

Exemplo de entrada:

Digite o código de acesso: 2023
Digite o nível de permissão: 2
Copiar código
Saída esperada:

Acesso permitido. Bem-vindo ao sistema!
 */

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String codigoNumerico;
        int nivelDePermissao;

        System.out.println("Me informe o Código Numérico: ");
        codigoNumerico = sc.nextLine();
        System.out.println("Me informe o Nível de Permissão: ");
        nivelDePermissao = sc.nextInt();

        if(codigoNumerico.equals(2023)){
            if(nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3){
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            }else{
                System.out.println("Acesso negado. Nível de Permissão incorreto!");
            }
        }else {
            if(nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3){
                System.out.println("Acesso negado. Código Numérico incorreto!");
            } else {
                System.out.println("Acesso negado. Código Numérico e Nível de Permissão incorretos");
            }
        }

    }
}

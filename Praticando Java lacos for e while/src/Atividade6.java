/*
Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número limitado de tentativas para inserir a senha corretamente. Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.

Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.

Exemplo de entrada:

Digite sua senha: 1234
Copiar código
Saída esperada:

Senha Correta! Acesso concedido!
Copiar código
ou

Exemplo de entrada:

Digite sua senha: 1111
Senha incorreta. Você tem 2 tentativas restantes.
Digite sua senha: 2222
Senha incorreta. Você tem 1 tentativa restante.
Digite sua senha: 3333
Copiar código
Saída esperada:

Conta bloqueada temporariamente.
 */


import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senha;

        for(int tentativa = 3; tentativa > 0; tentativa--){
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
            if(senha.equals(senhaCorreta)){
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativa > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativa -1)+ " tentativas restantes");
            }else {
                System.out.println("Senha bloqueada temporariamente. ");
            }

        }

    }




}

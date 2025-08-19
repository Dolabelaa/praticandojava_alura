/*Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.

Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.

Exemplo de Entrada:

Digite o dia da semana (em letras minúsculas): quarta

Saída esperada:

Quarta é um dia útil.
 */

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String diaDaSemana;
        System.out.println("Me diga em letras minúsculas, o dia da semana: ");
        diaDaSemana = sc.nextLine();

        if(diaDaSemana.equals("segunda") || diaDaSemana.equals("terca") || diaDaSemana.equals("quarta") || diaDaSemana.equals("quinta") || diaDaSemana.equals("sexta")){
            System.out.println(diaDaSemana + " é um dia útil.");
        }else{
            System.out.println(diaDaSemana + " não é dia útil.");
        }
    }
}

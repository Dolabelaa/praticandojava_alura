/*
Maria quer calcular a soma de todos os números pares de 1 a 100. Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2. Crie um programa que realize essa tarefa.

Saída esperada:

A soma dos números pares de 1 a 100 é: 2550
 */

public class Atividade3 {
    public static void main(String[] args){
        int result=0;
        for(int i=1; i <= 100; i++){
            if(i % 2 == 0){
                result += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: "+result);
    }
}

/*
Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:

O estudante é aprovado se média final é maior ou igual a 7.0.

Se a média for entre 5.0 e 6.9, está de recuperação.

Se for abaixo de 5.0, está reprovado.

Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.

Saída esperada:

O estudante teve média 8.2 e foi aprovado.

Ou

O estudante teve média 5.8 e está de recuperação.

Ou

O estudante teve média 4.3 e foi reprovado.
 */

public class Atividade2 {

    public static void main(String[] args){

        double mediaFinal=4.3;

        if(mediaFinal >= 7.0){
            System.out.println("Aluno aprovado! Com média: "+ mediaFinal);
        }else if(mediaFinal >=5.0 && mediaFinal <= 6.9){
            System.out.println("Aluno de recuperação. Com média:"+ mediaFinal);
        }else{
            System.out.println("Aluno reprovado. Com média:"+ mediaFinal);
        }
    }
}

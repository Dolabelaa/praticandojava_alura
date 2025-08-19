/*
Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.

Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:

Econômico: preço até R$ 50,00.
Intermediário: preço entre R$ 50,01 e R$ 200,00.
Premium: preço acima de R$ 200,00. Exemplo de entrada:
double preco = 150.00;

Saída esperada:

Categoria do produto: Intermediário
 */

public class Atividade6 {

    public static void main(String[] args){

        double preco = 150.0;

        if(preco <= 50.00){
            System.out.println("Econômico.");
        }else if(preco > 50 && preco <= 200.00){
            System.out.println("Intermediário.");
        }else{
            System.out.println("Premium.");
        }
    }
}

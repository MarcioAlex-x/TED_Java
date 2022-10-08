package Exercicios;

/* A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. (comando if) */

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        var salario= 0;
        var valor_prest_max = 0;
        var valor_prestacao = 0;
        

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salario = leitor.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quanto você quer pagar por prestação? ");
        valor_prestacao = leitor2.nextInt();

        valor_prest_max = (30 * salario) / 100;

        if (valor_prestacao < valor_prest_max ){
            System.out.println("Emprestimo Aprovado!");
        } else {
            System.out.println("Emprestimo não Aprovado! ");
        }
    }
}

package Exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        var creditos_galaticos = 0;
        var percentual_aumento = 0;
        var novo_credito = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Qual o valor do Crédito Galático? ");
        creditos_galaticos = leitor_creditos.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Qual o percentual de aumento? ");
        percentual_aumento = leitor_percentual.nextInt();

        novo_credito = ((percentual_aumento * creditos_galaticos) / 100) + creditos_galaticos;

        System.out.println("Os créditos galáticos com o aumento é: " + novo_credito);


    }
}

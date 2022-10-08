package Exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        
        var nome_cliente = "";
        var qtd_dias = 0;
        var valor_dias = 0;
        var cliente_ct = 0;
        var diaria = 40;
        var i = 0;
        
        var total_receber = 0;

        while (i < 5 ) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Informe o seu nome ");
            nome_cliente = leitor1.nextLine();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Quantos dias pretende ficar? ");
            qtd_dias = leitor2.nextInt();

            if (qtd_dias < 10) {
                valor_dias = qtd_dias * 15;
            } else if (qtd_dias >= 10) {
                valor_dias = qtd_dias * 8;
            }
            cliente_ct = diaria + valor_dias;
            total_receber += cliente_ct;
            System.out.println("O valor cobra de " + nome_cliente + " será no valor de: " + cliente_ct);
            i++;
        }
        System.out.println("O arrecadado neste período foi de: " + total_receber);

    }
}

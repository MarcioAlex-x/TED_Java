package Exercicios;

import java.util.Scanner;


public class exercicio04 {
    public static void main(String[] args) {
        int litros_gasolina = 0;

        Scanner leitor = new Scanner(System.in);
            System.out.println("Quantos litros foi colocado?" );
            litros_gasolina = leitor.nextInt();
        
        var valor_gasolina = litros_gasolina * 2.5;
        var valor_ref = 6;

        var valor_total = valor_gasolina + valor_ref  ;

        System.out.println("O total a pagar foi: R$" + valor_total );
        
    }
}

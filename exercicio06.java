package Exercicios;

import java.util.Scanner;


public class exercicio06 {
    public static void main(String[] args) {
        var alunos = 0;
        var i = 0;
        var primeira_nota= 0;
        var segunda_nota = 0;
        var media = 0;
        var aprovados = 0;
        var total_exames = 0;
        var reprovados = 0;
        var media_geral = 0;


        for (i=0; i<6; i++){

            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            primeira_nota = leitor1.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Segunda nota: ");
            segunda_nota = leitor2.nextInt();
            
            media = (primeira_nota + segunda_nota) / 2;

            if (media < 3){
                System.out.println("Reprovado!");
                reprovados++;

            } else if (media >=3 && media <7) {
                System.out.println("Exame");
                total_exame++;

                
            } else if (media >= 7){
                System.out.println("Aprovado! ");
                aprovados++;
            }
            media_geral += media / 6; 


        }
        System.out.println("O total de alunos aprovados foi: "+ aprovados);
        System.out.println("O total de alunos para fazer exame será: " + total_exames);
        System.out.println("O total de alunos reprovados foi: " + reprovados);
        System.out.println("Média da classe foi: " + media);
    }

}

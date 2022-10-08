package Exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
      var c = 0;
      while (c <10) {
          try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("digite um valor qualquer:");
              var num = leitor.nextInt();
              c++;
              if (num % 2 == 0) {
                  System.out.println("par!");
              } else {
                  System.out.println("impar!");
              }
        }
      }
    }
}

package Exercicios;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        int anoDigitado = 0;
        final int divisor = 4;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um ano:");
            anoDigitado = scanner.nextInt();

            if (anoDigitado == 0) {
                System.out.println("O ano digitado é zero!");

            } else if (anoDigitado % 400 == 0 || (anoDigitado % 4 == 0 && anoDigitado % 100 != 0)) {
                System.out.println("O ano digitado é bissexto");

            } else {
                System.out.println("O ano digitado não é bissexto!");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        }
    }
}

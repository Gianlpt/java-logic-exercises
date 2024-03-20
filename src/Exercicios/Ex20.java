package Exercicios;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        int numeroDigitado = 0;
        final int divisor = 2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            numeroDigitado = scanner.nextInt();
            int resto = numeroDigitado % divisor;

            if (numeroDigitado == 0) {
                System.out.println("O número digitado é zero!");

            } else if (resto == 0) {
                System.out.println("O número digitado é par!");

            } else {
                System.out.println("O número digitado é impar!");
            }


        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }

    }
}

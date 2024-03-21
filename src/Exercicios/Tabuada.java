package Exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para ver sua tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("Tabuada de " + numero + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } catch (Exception e) {
        System.out.println("Por favor, digite um número inteiro válido.");
        }
    }
}

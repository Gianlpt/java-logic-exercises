//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.

package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um valor:");
            valor1 = scanner.nextInt();
            System.out.println("Digite outro valor:");
            valor2 = scanner.nextInt();

            int valorFinal = valor1 + valor2;
            System.out.println("A soma entre " + valor1 + " + " + valor2 + " é igual a " + valorFinal);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira apenas números inteiros.");
        }
    }

}

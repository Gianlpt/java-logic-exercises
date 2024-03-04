/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor. */

package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int enteredValue = 0;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            enteredValue = scanner.nextInt();
            System.out.println("O antecessor de " + enteredValue + " é " + (enteredValue - 1));
            System.out.println("O sucessor de " + enteredValue + " é " + (enteredValue + 1));

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro.");
        }
    } 
} 

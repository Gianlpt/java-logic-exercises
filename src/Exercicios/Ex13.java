/*Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento. */
package Exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double remuneration = 0;
        final double increase = 0.15;

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual é o seu salário?");
            remuneration = scanner.nextDouble();
            double salaryIncrease = remuneration * increase;
            double remunerationFinal = remuneration + salaryIncrease;

            System.out.println("Seu novo salário sera de: R$" + String.format("%.2f",remunerationFinal));
            
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }
    
}

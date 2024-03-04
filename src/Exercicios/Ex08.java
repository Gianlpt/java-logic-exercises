/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas. */

package Exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        double distance = 0;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite uma distância em metros:");
            distance = scanner.nextDouble();
            
            System.out.println("A distância de " + distance + "m corresponde a: ");
            System.out.println((distance / 1000) + "Km");
            System.out.println((distance / 100) + "Hm");
            System.out.println((distance / 10) + "Dam");
            System.out.println((distance * 10) + "dm");
            System.out.println((distance * 100) + "cm");
            System.out.println((distance * 1000) + "mm");

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }

    }

}

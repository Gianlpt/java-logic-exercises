/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. */

package Exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        double moneyInWallet = Math.floor(0);

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite quanto reais você possui:");
            moneyInWallet = scanner.nextDouble();
            final double exchangeRate = 4.95;
            double moneyInDollars = moneyInWallet / exchangeRate;

            System.out.println("Após a conversão você possui:" + String.format("%.2f", moneyInDollars) + " dólares.");

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }
}

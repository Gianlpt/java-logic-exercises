/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */

package Exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    private static final double precoDia = 90.0;
    private static final double precoKm = 0.20;

    public static void main(String[] args) {
        int diasAlugado = 0;
        double kmsRodados = 0;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Quantos dias o cliente ficou com o carro?");
            diasAlugado = scanner.nextInt();
            System.out.println("Quantos kms o cliente rodou com o carro?");
            kmsRodados = scanner.nextDouble();
            double precoFinal = calcularPrecoFinal(diasAlugado, kmsRodados);
            
            System.out.printf("O cliente deverá pagar: R$ %.2f%n", precoFinal);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }

    }

    public static double calcularPrecoFinal(int diasAlugado, double kmsRodados) {
        return (diasAlugado * precoDia) + (kmsRodados * precoKm);
    }
}

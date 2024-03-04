/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto. */

package Exercicios;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        double fullPrice = 0;
        final double discount = 0.05;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual o valor do produto?");
            fullPrice = scanner.nextDouble();

            double discountAmount = fullPrice * discount;
            double discountedPrice = fullPrice - discountAmount;

            System.out.println("O preço do produto com desconto é de: R$" +  discountedPrice);
            
        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

}

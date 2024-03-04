/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados. */

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double altura = 0;
        double largura = 0;
        final double metrosPorLitro = 2;

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual é a altura da parede?");
            altura = scanner.nextDouble();
            System.out.println("Qual é a largura da parede?");
            largura = scanner.nextDouble();
            double area = altura * largura;

        System.out.println("A área a ser pintada é de " + String.format("%.2f", area) + " metros quadrados e a quantidade de tinta a ser utilizada é de " + String.format("%.2f", area/metrosPorLitro) + " litros");
            
        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }
}

/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta. */

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double valorDeA = 0;
        double valorDeB = 0;
        double valorDeC = 0;

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Digite o valor de A:");
            valorDeA = scanner.nextDouble();
            System.out.println("Digite o valor de B:");
            valorDeB = scanner.nextDouble();
            System.out.println("Digite o valor de C:");
            valorDeC = scanner.nextDouble();
            
            double valorDoDelta = calcularDelta(valorDeA, valorDeB, valorDeC);
            
            System.out.println("O valor do delta é:" + String.format("%.3f", valorDoDelta));

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }

    }

    public static  double calcularDelta(double a, double b, double c){
    return (b * b) - 4 * a * c;
    
}
}

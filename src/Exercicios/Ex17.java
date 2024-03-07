package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {
    static final int velocidadeMaxima = 80;

    public static void main(String[] args) {

        try( Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite a velocidade do veículo em Km/h: ");

            double velocidade = scanner.nextDouble();
            double valocidadeExcedida = velocidade - velocidadeMaxima;

            if (velocidade > 80) {
                double valorMulta = (velocidade - velocidadeMaxima) * 5;
                System.out.printf("Você foi multado em R$ %.2f por exceder o limite em %.2f Km.%n", valorMulta, valocidadeExcedida);

            } else {
                System.out.println("Velocidade dentro do limite permitido, você não foi multado.");

            }
        }catch (Exception e){
            System.out.println("Por favor, digite somente números.");
        }
    }
}




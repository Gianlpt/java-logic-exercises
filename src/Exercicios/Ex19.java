package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        final double mediaNecessaria = 7;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o nome do aluno(a): ");
            String nomeDoAluno = scanner.nextLine();
            System.out.println("Digite a primeira nota do aluno:");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno:");
            nota2 = scanner.nextDouble();

            if (((nota1 + nota2) / 2) >= mediaNecessaria) {
                System.out.println("O aluno(a) " + nomeDoAluno + " teve um bom aproveitamento com uma media de " + (nota1 + nota2) / 2 + "!");
            } else {
                System.out.println("O aluno(a) " + nomeDoAluno + " não teve um bom aproveitamento com uma media de " + (nota1 + nota2) / 2 + "!");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números nos campos nota.");
        }

    }
}

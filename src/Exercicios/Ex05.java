package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double nota1Double = 0;
        double nota2Double = 0;
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a nota 1ª do(a) aluno(a)?");
            nota1Double = scanner.nextDouble();
            System.out.println("Qual a nota 2ª do(a) aluno(a)?");
            nota2Double = scanner.nextDouble();

            double notaFinal = (nota1Double + nota2Double) / 2;
            System.out.println("A média entre " + nota1Double + " e " + nota2Double + " é igual a " + notaFinal);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira apenas números válidos.");
        }
    }
}


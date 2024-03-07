package Exercicios;

import java.util.Scanner;
import java.time.LocalDate;

import static Exercicios.Ex18.AnoAtual.calcularAnoAtual;

public class Ex18 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o ano em que você nasceu:");
            int anoNascimento = scanner.nextInt();
            int anoAtual = calcularAnoAtual();

            if ((anoAtual - anoNascimento) > 15) {
                System.out.println("Você ja pode votar!");

            } else {
                System.out.println("Você não pode votar!");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public class AnoAtual {
        public static int calcularAnoAtual() {
            LocalDate dataAtual = LocalDate.now();
            int anoAtual = dataAtual.getYear();
            return anoAtual;
        }

    }
}




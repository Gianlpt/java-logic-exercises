package Exercicios;

import java.util.Scanner;
import java.time.LocalDate;

public class Ex22 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();

            LocalDate dataAtual = LocalDate.now();
            int anoAtual = dataAtual.getYear();

            int idade = anoAtual - anoNascimento;

            if (anoNascimento >= anoAtual) {
                System.out.println("Ano de nascimento inválido.");
                return;
            }

            if (idade < 18) {
                int anosFaltantes = 18 - idade;
                System.out.println("Faltam " + anosFaltantes + " anos para o alistamento");
            } else if (idade == 18) {
                System.out.println("Esta no ano do alistamento");

            } else {
                int anosPassados = idade - 18;
                System.out.println("Ja se passaram " + anosPassados + " anos do alistamento");
            }

        } catch (Exception e) {
            System.out.println("Por favor, insira um valor válido para o ano de nascimento.");
        }
    }
}

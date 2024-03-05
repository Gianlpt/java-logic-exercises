/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.*/

package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int diasTrabalhdos = 0;
        final int pagamentoDiario = 25;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quantos dias o funcionário trabalhou este mês?");
            diasTrabalhdos = scanner.nextInt();
            System.out.println("O funcionário deverá receber R$" + diasTrabalhdos * pagamentoDiario);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }
}

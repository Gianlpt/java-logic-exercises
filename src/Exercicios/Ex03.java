/* 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */

package Exercicios;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM");
        String mesAtual = dataAtual.format(formato);

        System.out.println("Qual o nome do funcionário?");
        String name = scanner.nextLine();
        System.out.println("Qual o salário do funcionário?");
        String salario = scanner.nextLine();
        double salarioReal = Double.parseDouble(salario);
        System.out.println("O funcionário " + name + " tem um salário de R$" + salarioReal + " em " + mesAtual);
        scanner.close();
    }
}

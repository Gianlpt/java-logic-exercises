/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/
package Exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int cigarrosPorDia = 0;
        int anosFumando = 0;
        final int minutosPerdidos = 10;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quantos cigarros você fuma por dia?");
            cigarrosPorDia = scanner.nextInt();
            System.out.println("Há quantos anos você fuma?");
            anosFumando = scanner.nextInt() * 365;

            int diasPerdidos = calculaDiasPerdidos(cigarrosPorDia, anosFumando );
            System.out.println("Você perderá " + diasPerdidos + " dias de vida.");

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }
    public static int calculaDiasPerdidos(int cigarrosPorDia, int anosFumando){
        return (((cigarrosPorDia * anosFumando)*10)/60)/24;
    }
}

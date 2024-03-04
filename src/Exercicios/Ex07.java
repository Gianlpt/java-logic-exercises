/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */

package Exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Ex07 {

    public static void main(String[] args) {
        double enteredValue = 0;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Digite um número:");
            enteredValue = scanner.nextDouble();

            System.out.println("O dobro de " + enteredValue + " é " + (enteredValue * 2));
            System.out.println("A terça parte de " + enteredValue + " é " + (enteredValue / 3));

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");

        }

    }
}

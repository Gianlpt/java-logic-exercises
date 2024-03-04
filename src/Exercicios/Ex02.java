//2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:

package Exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = scanner.nextLine();
        System.out.println("Olá " +  name +", é um prazer te conhecer!");
        scanner.close();
    }
  
}

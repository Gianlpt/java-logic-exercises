package Exercicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();

        int opcao = 100;
        Scanner scanner = new Scanner(System.in);

        while (opcao > 0 && opcao <= 100) {
            System.out.print("Selecione o exercicio: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    exercicios.Ex01();
                    break;
                case 2:
                    exercicios.Ex02();
                    break;
                case 3:
                    exercicios.Ex03();
                    break;
                case 4:
                    exercicios.Ex04();
                    break;
                case 5:
                    exercicios.Ex05();
                    break;
                case 6:
                    exercicios.Ex06();
                    break;
                case 7:
                    exercicios.Ex07();
                    break;
                case 8:
                    exercicios.Ex08();
                    break;
                case 9:
                    exercicios.Ex09();
                    break;
                case 10:
                    exercicios.Ex10();
                    break;
                case 11:
                    exercicios.Ex11();
                    break;
                case 12:
                    exercicios.Ex12();
                    break;
                case 13:
                    exercicios.Ex13();
                    break;
                case 14:
                    exercicios.Ex14();
                    break;
                case 15:
                    exercicios.Ex15();
                    break;
                case 16:
                    exercicios.Ex16();
                    break;
                case 17:
                    exercicios.Ex17();
                    break;
                case 18:
                    exercicios.Ex18();
                    break;
                case 19:
                    exercicios.Ex19();
                    break;
                case 20:
                    exercicios.Ex20();
                    break;
                case 21:
                    exercicios.Ex21();
                    break;
                case 22:
                    exercicios.Ex22();
                    break;
                case 23:
                    exercicios.Ex23();
                    break;
                case 24:
                    exercicios.Ex24();
                    break;
                case 25:
                    exercicios.Ex25();
                    break;
                case 26:
                    exercicios.Ex26();
                    break;
                case 27:
                    exercicios.Ex27();
                    break;
                case 28:
                    exercicios.Ex28();
                    break;
                case 29:
                    exercicios.Ex29();
                    break;
                case 30:
                    exercicios.Ex30();
                    break;
                case 31:
                    exercicios.Ex31();
                    break;
                case 32:
                    exercicios.Ex32();
                    break;
                case 33:
                    exercicios.Ex33();
                    break;
                case 34:
                    exercicios.Ex34();
                    break;
                case 35:
                    exercicios.Ex35();
                    break;
                default:
                    // Caso nenhuma opção válida seja escolhida
                    System.out.println("Encerrando!");
                    break;
            }


        }
    }


}

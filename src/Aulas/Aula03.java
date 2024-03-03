package Aulas;
import java.util.Scanner; // Importa a classe Scanner para permitir entrada de dados pelo terminal

public class Aula03 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada de dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o nome e idade e armazena os valores em duas variáveis
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Imprime uma mensagem de saudação com o nome digitado pelo usuário
        System.out.println("Olá, " + nome + " de " + idade + " anos!");

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

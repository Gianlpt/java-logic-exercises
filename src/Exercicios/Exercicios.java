package Exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Exercicios {

    public void Ex01() {
        System.out.println("Olá, Mundo!!");
    }

    public void Ex02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = scanner.nextLine();
        System.out.println("Olá " + name + ", é um prazer te conhecer!");

    }

    public void Ex03() {
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

    }

    public void Ex04() {
        int valor1 = 0;
        int valor2 = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um valor:");
            valor1 = scanner.nextInt();
            System.out.println("Digite outro valor:");
            valor2 = scanner.nextInt();

            int valorFinal = valor1 + valor2;
            System.out.println("A soma entre " + valor1 + " + " + valor2 + " é igual a " + valorFinal);

            scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira apenas números inteiros.");
        }
    }

    public void Ex05() {
        double nota1Double = 0;
        double nota2Double = 0;

        try {
            Scanner scanner = new Scanner(System.in);
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

    public void Ex06() {
        int enteredValue = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número:");
            enteredValue = scanner.nextInt();
            System.out.println("O antecessor de " + enteredValue + " é " + (enteredValue - 1));
            System.out.println("O sucessor de " + enteredValue + " é " + (enteredValue + 1));

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro.");
        }
    }

    public void Ex07() {
        double enteredValue = 0;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Digite um número:");
            enteredValue = scanner.nextDouble();

            System.out.println("O dobro de " + enteredValue + " é " + (enteredValue * 2));
            System.out.println("A terça parte de " + enteredValue + " é " + (enteredValue / 3));

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");

        }
    }

    public void Ex08() {
        double distance = 0;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite uma distância em metros:");
            distance = scanner.nextDouble();

            System.out.println("A distância de " + distance + "m corresponde a: ");
            System.out.println((distance / 1000) + "Km");
            System.out.println((distance / 100) + "Hm");
            System.out.println((distance / 10) + "Dam");
            System.out.println((distance * 10) + "dm");
            System.out.println((distance * 100) + "cm");
            System.out.println((distance * 1000) + "mm");

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex09() {
        double moneyInWallet = Math.floor(0);

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite quanto reais você possui:");
            moneyInWallet = scanner.nextDouble();
            final double exchangeRate = 4.95;
            double moneyInDollars = moneyInWallet / exchangeRate;

            System.out.println("Após a conversão você possui:" + String.format("%.2f", moneyInDollars) + " dólares.");

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex10() {
        double altura = 0;
        double largura = 0;
        final double metrosPorLitro = 2;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Qual é a altura da parede?");
            altura = scanner.nextDouble();
            System.out.println("Qual é a largura da parede?");
            largura = scanner.nextDouble();
            double area = altura * largura;

            System.out.println("A área a ser pintada é de " + String.format("%.2f", area) + " metros quadrados e a quantidade de tinta a ser utilizada é de " + String.format("%.2f", area / metrosPorLitro) + " litros");

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex11() {
        double valorDeA = 0;
        double valorDeB = 0;
        double valorDeC = 0;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o valor de A:");
            valorDeA = scanner.nextDouble();
            System.out.println("Digite o valor de B:");
            valorDeB = scanner.nextDouble();
            System.out.println("Digite o valor de C:");
            valorDeC = scanner.nextDouble();

            double valorDoDelta = calcularDelta(valorDeA, valorDeB, valorDeC);

            System.out.println("O valor do delta é:" + String.format("%.3f", valorDoDelta));

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }

    }


    public void Ex12() {
        double fullPrice = 0;
        final double discount = 0.05;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o valor do produto?");
            fullPrice = scanner.nextDouble();

            double discountAmount = fullPrice * discount;
            double discountedPrice = fullPrice - discountAmount;

            System.out.println("O preço do produto com desconto é de: R$" + discountedPrice);

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex13() {
        double remuneration = 0;
        final double increase = 0.15;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Qual é o seu salário?");
            remuneration = scanner.nextDouble();
            double salaryIncrease = remuneration * increase;
            double remunerationFinal = remuneration + salaryIncrease;

            System.out.println("Seu novo salário sera de: R$" + String.format("%.2f", remunerationFinal));

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex14() {
        int diasAlugado = 0;
        double kmsRodados = 0;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Quantos dias o cliente ficou com o carro?");
            diasAlugado = scanner.nextInt();
            System.out.println("Quantos kms o cliente rodou com o carro?");
            kmsRodados = scanner.nextDouble();
            double precoFinal = calcularPrecoFinal(diasAlugado, kmsRodados);

            System.out.printf("O cliente deverá pagar: R$ %.2f%n", precoFinal);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex15() {
        int diasTrabalhdos = 0;
        final int pagamentoDiario = 25;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Quantos dias o funcionário trabalhou este mês?");
            diasTrabalhdos = scanner.nextInt();
            System.out.println("O funcionário deverá receber R$" + diasTrabalhdos * pagamentoDiario);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex16() {
        int cigarrosPorDia = 0;
        int anosFumando = 0;
        final int minutosPerdidos = 10;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantos cigarros você fuma por dia?");
            cigarrosPorDia = scanner.nextInt();
            System.out.println("Há quantos anos você fuma?");
            anosFumando = scanner.nextInt() * 365;

            int diasPerdidos = calculaDiasPerdidos(cigarrosPorDia, anosFumando);
            System.out.println("Você perderá " + diasPerdidos + " dias de vida.");

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }


    public void Ex17() {
        int velocidadeMaxima = 80;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite a velocidade do veículo em Km/h: ");

            double velocidade = scanner.nextDouble();
            double valocidadeExcedida = velocidade - velocidadeMaxima;

            if (velocidade > 80) {
                double valorMulta = (velocidade - velocidadeMaxima) * 5;
                System.out.printf("Você foi multado em R$ %.2f por exceder o limite em %.2f Km.%n", valorMulta, valocidadeExcedida);

            } else {
                System.out.println("Velocidade dentro do limite permitido, você não foi multado.");

            }
        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }
    }

    public void Ex18() {
        try {
            Scanner scanner = new Scanner(System.in);
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


    public void Ex19() {
        double nota1 = 0;
        double nota2 = 0;
        final double mediaNecessaria = 7;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o nome do aluno(a): ");
            String nomeDoAluno = scanner.nextLine();
            System.out.println("Digite a primeira nota do aluno:");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno:");
            nota2 = scanner.nextDouble();

            if (((nota1 + nota2) / 2) >= mediaNecessaria) {
                System.out.println("O aluno(a) " + nomeDoAluno + " teve um bom aproveitamento com uma media de " + (nota1 + nota2) / 2 + "!");
            } else {
                System.out.println("O aluno(a) " + nomeDoAluno + " não teve um bom aproveitamento com uma media de " + (nota1 + nota2) / 2 + "!");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números nos campos nota.");
        }

    }

    public void Ex20() {
        int numeroDigitado = 0;
        final int divisor = 2;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número:");
            numeroDigitado = scanner.nextInt();
            int resto = numeroDigitado % divisor;

            if (numeroDigitado == 0) {
                System.out.println("O número digitado é zero!");

            } else if (resto == 0) {
                System.out.println("O número digitado é par!");

            } else {
                System.out.println("O número digitado é impar!");
            }


        } catch (Exception e) {
            System.out.println("Por favor, digite somente números.");
        }

    }

    public void Ex21() {
        int anoDigitado = 0;
        final int divisor = 4;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um ano:");
            anoDigitado = scanner.nextInt();

            if (anoDigitado == 0) {
                System.out.println("O ano digitado é zero!");

            } else if (anoDigitado % 400 == 0 || (anoDigitado % 4 == 0 && anoDigitado % 100 != 0)) {
                System.out.println("O ano digitado é bissexto");

            } else {
                System.out.println("O ano digitado não é bissexto!");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        }
    }

    public void Ex22() {
        try {
            Scanner scanner = new Scanner(System.in);
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

    public void Ex23() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            System.out.println("Digite seu sexo (M ou F):");
            char sexo = scanner.next().charAt(0);
            System.out.println("Digite o valor das compras");
            double valorCompra = scanner.nextDouble();

            double desconto = 0;
            if (sexo == 'M' || sexo == 'm') {
                desconto = valorCompra * 0.05;
            } else if (sexo == 'F' || sexo == 'f') {
                desconto = valorCompra * 0.13;
            } else {
                Random random = new Random();
                double descontoAletorio = random.nextDouble(0.05, 0.13);
                desconto = valorCompra * descontoAletorio;
            }
            double valorFinal = valorCompra - desconto;
            System.out.println("O cliente " + nome);
            System.out.println("Valor da compra: R$" + valorCompra);
            System.out.printf("Valor com desconto: R$ %.2f", valorFinal);

        } catch (Exception e) {
            System.out.println("Dados digitados são invalidos");
        }
    }

    public void Ex24() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            double passagemSemDesconto = 0.50;
            double passagemComDesconto = 0.45;

            System.out.println("Qual a distância em kms a ser percorrida?");
            float distancia = scanner.nextFloat();

            if (distancia < 0) {
                System.out.println("Distancia inserida é invalida!!");

            } else if (distancia <= 200) {
                double valorTotal = distancia * passagemSemDesconto;
                System.out.printf("O valor a ser pago é: R$ %.2f", valorTotal);

            } else {
                double valorTotal = distancia * passagemComDesconto;
                System.out.printf("O valor a ser pago é: R$ %.2f", valorTotal);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Ex25() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o comprimento do lado 1:");
            float lado1 = scanner.nextFloat();

            System.out.println("Digite o comprimento do lado 2:");
            float lado2 = scanner.nextFloat();

            System.out.println("Digite o comprimento do lado 3:");
            float lado3 = scanner.nextFloat();

            if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
                System.out.println("É possível formar um triângulo com essas retas");

            } else {
                System.out.println("Não é possível formar um triângulo com essas retas");

            }

        } catch (Exception e) {
            System.out.println("Digite apenas números e use o ponto (.) como separador decimal!");
        }
    }

    public void Ex26() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            int numero1 = scanner.nextInt();
            System.out.println("Digite outro número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                System.out.println("O primeiro valor é o maior.");

            } else if (numero2 > numero1) {
                System.out.println("O segundo valor é o maior.");

            } else {
                System.out.println("Não existe valor maior, os dois são iguais.");
            }

        } catch (Exception e) {
            System.out.println("Por favor, digite somente números inteiros!");

        }

    }

    public void Ex27() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite a primeira nota do aluno(a): ");
            float nota1 = scanner.nextFloat();
            System.out.println("Digite a segunda nota do aluno(a): ");
            float nota2 = scanner.nextFloat();
            float media = (nota1 + nota2) / 2;


            if (media < 5) {
                System.out.println("Aluno:  REPROVADO nota " + media);

            } else if (media < 7) {
                System.out.println("Aluno em: RECUPERAÇÃO nota " + media);

            } else {
                System.out.println("Aluno: APROVADO nota " + media);
            }

        } catch (Exception e) {
            System.out.println("Digite apenas números e use o ponto (.) como separador decimal!");
        }
    }

    public void Ex28() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Informe a largura do terreno: ");
            float largura = scanner.nextFloat();
            System.out.println("Informe o comprimento do terreno: ");
            float comprimento = scanner.nextFloat();
            float metroQuadrado = largura * comprimento;

            if (largura <= 0 || comprimento <= 0) {
                System.out.println("Dimensões inválidas! A largura e o comprimento devem ser maiores que zero.");

            } else if (metroQuadrado < 100) {
                System.out.println("Seu terreno tem " + metroQuadrado + "m² = TERRENO POPULAR");

            } else if (metroQuadrado < 500) {
                System.out.println("Seu terreno tem " + metroQuadrado + "m² = TERRENO MASTER");
            } else {
                System.out.println("Seu terreno tem " + metroQuadrado + "m² = TERRENO VIP");
            }

        } catch (Exception e) {
            System.out.println("Digite apenas números e use o ponto (.) como separador decimal!");
        }
    }

    public void Ex29() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome do funcionário(a): ");
        String funcionario = scanner.next();

        System.out.println("Informe o salário do funcionário(a): ");
        double salario = scanner.nextDouble();

        System.out.println("Informe quantos anos o funcionário(a) trabalha na empresa: ");
        double anosTrabalhados = scanner.nextDouble();

        double novoSalario = calcularNovoSalario(salario, anosTrabalhados);

        System.out.println("Novo salário de " + funcionario + ": R$ " + novoSalario);

    }

    public void Ex30() {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o comprimento do lado 1:");
            float lado1 = scanner.nextFloat();

            System.out.println("Digite o comprimento do lado 2:");
            float lado2 = scanner.nextFloat();

            System.out.println("Digite o comprimento do lado 3:");
            float lado3 = scanner.nextFloat();

            if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {

                if (lado1 == lado2 && lado3 == lado1) {
                    System.out.println("É possível formar um triângulo com essas retas e o triângulo será EQUILÁTERO");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("É possível formar um triângulo com essas retas e o triângulo será ISÓSCELES");
                } else {
                    System.out.println("É possível formar um triângulo com essas retas e o triângulo será ESCALENO");
                }

            } else {
                System.out.println("Não é possível formar um triângulo com essas retas");

            }

        } catch (Exception e) {
            System.out.println("Digite apenas números e use o ponto (.) como separador decimal!");
        }


    }

    public void Ex31() {
        try {
            int PEDRA = 1, PAPEL = 2, TESOURA = 3;
            Random random = new Random();
            int opcaoPc = random.nextInt(1, 3);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Selecione :\n 1 - Pedra\n 2 - Papel\n 3 - Tesoura\n");
            int opcaoJogador = scanner.nextInt();

            String opcao1, opcao2;

            if (opcaoJogador == 1) {
                opcao1 = "PEDRA";
            } else if (opcaoJogador == 2) {
                opcao1 = "PAPEL";
            } else {
                opcao1 = "TESOURA";
            }

            if (opcaoPc == 1) {
                opcao2 = "PEDRA";
            } else if (opcaoPc == 2) {
                opcao2 = "PAPEL";
            } else {
                opcao2 = "TESOURA";
            }
            if (opcaoJogador < PEDRA || opcaoJogador > TESOURA) {
                System.out.println("Selecione somente uma das opções: 1, 2 ou 3!!!");
            } else if (opcaoJogador == opcaoPc) {
                System.out.println("Empate");
            } else if ((opcaoJogador == PEDRA && opcaoPc == TESOURA) ||
                    (opcaoJogador == PAPEL && opcaoPc == PEDRA) ||
                    (opcaoJogador == TESOURA && opcaoPc == PAPEL)) {
                System.out.println("Você escolheu " + opcao1 + "(" + opcaoJogador + ") e o computador escolheu " + opcao2 + "(" + opcaoPc + "). Você ganhou!");
            } else {
                System.out.println("Você escolheu " + opcao1 + "(" + opcaoJogador + ") e o computador escolheu " + opcao2 + "(" + opcaoPc + "). Você perdeu!");
            }
        } catch (Exception e) {
            System.out.println("Selecione somente uma das opções: 1, 2 ou 3!!!");
        }

    }

    public void Ex32() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1, 5);

        System.out.println("Escolha um núemro entre 1 e 5");
        int numeroEscolhido = scanner.nextInt();

        if (numeroAleatorio == numeroEscolhido) {
            System.out.println("Acerto Mizeravi!!");

        } else {
            System.out.println("Tenta novamente");
        }

    }

    public void Ex33() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor da casa?");
        double valorCasa = scanner.nextDouble();
        System.out.println("Qual o salário do comprador?");
        double salarioComprador = scanner.nextDouble();
        System.out.println("Em quanto anos ele vai pagar?");
        int anosPagando = scanner.nextInt();
        int meses = anosPagando * 12;
        double prestacaoMensal = valorCasa / meses;
        double limitePrestacao = salarioComprador * 0.3;

        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Emprestimo aprovado a prestação mensal sera de R$" + prestacaoMensal);
        } else {
            System.out.println("Emprestimo não aprovado");
        }


    }

    public void Ex34() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC é: %.2f Abaixo do peso%n", imc);
        } else if (imc < 25) {
            System.out.printf("Seu IMC é: %.2f Peso ideal%n", imc);
        } else if (imc > 25 && imc <= 30) {
            System.out.printf("Seu IMC é: %.2f Sobrepeso%n", imc);
        } else if (imc < 40) {
            System.out.printf("Seu IMC é: %.2f Obesidade%n", imc);
        } else {
            System.out.printf("Seu IMC é: %.2f Obesidade mórbida%n", imc);
        }
    }

    public void Ex35() {
        Scanner scanner = new Scanner(System.in);
        double precoCarroPopular = 90, precoCarroLuxo = 150;
        System.out.println("Selecione uma das opções:\n" +
                "1 - Carro Popular\n" +
                "2 - Carro Luxo");
        int opcao = scanner.nextInt();
        System.out.println("Quantos dias o carro ficou com o cliente?");
        int diasComCliente = scanner.nextInt();
        System.out.println("Quantos km foram percorridos pelo cliente?");
        int kmsPercorridos = scanner.nextInt();
        double precoFinal = 0;

        if(opcao == 1){
            if(kmsPercorridos <= 100){
                precoFinal = (diasComCliente * precoCarroPopular) + (kmsPercorridos * 0.20);
            }else {
                precoFinal = (diasComCliente * precoCarroPopular) + (kmsPercorridos * 0.10);
            }
        } else if (opcao == 2) {
            if(kmsPercorridos < 200){
                precoFinal = (diasComCliente * precoCarroLuxo) + (kmsPercorridos * 0.30);
            }else {
                precoFinal = (diasComCliente * precoCarroLuxo) + (kmsPercorridos * 0.25);
            }

        }
        System.out.println("O total a pagar pelo carro é R$: " + precoFinal);
    }


    public static double calcularDelta(double a, double b, double c) {
        return (b * b) - 4 * a * c;
    }

    public static double calcularNovoSalario(double salario, double anosTrabalhados) {
        double percentualAumento;

        if (anosTrabalhados < 3) {
            percentualAumento = 0.03;
        } else if (anosTrabalhados < 10) {
            percentualAumento = 0.125;
        } else {
            percentualAumento = 0.20;
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        return novoSalario;
    }

    public static int calcularAnoAtual() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        return anoAtual;
    }

    public static int calculaDiasPerdidos(int cigarrosPorDia, int anosFumando) {
        return (((cigarrosPorDia * anosFumando) * 10) / 60) / 24;
    }

    public static double calcularPrecoFinal(int diasAlugado, double kmsRodados) {
        double precoDia = 90.0;
        double precoKm = 0.20;
        return (diasAlugado * precoDia) + (kmsRodados * precoKm);
    }

}


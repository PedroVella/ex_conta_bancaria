package Program;

import entities.Conta;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Conta conta1;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Voce tem uma deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

    if (resposta == 's') {
        System.out.print("Digite o deposito inicial: ");
        double valorInicial = sc.nextDouble();

        conta1 = new Conta(numero, nome, valorInicial);
    }
    else {
        conta1 = new Conta(numero, nome);
    }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta1.Deposito(valorDeposito);

        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta1.Saque(valorSaque);

        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta1);

    }
}
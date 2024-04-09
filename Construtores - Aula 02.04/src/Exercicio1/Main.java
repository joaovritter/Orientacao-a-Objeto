package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		ContaCorrente conta = new ContaCorrente ();
		System.out.println("Digite o saldo inicial: ");
		conta.definirSaldoInicial(teclado.nextDouble());
		int opcao;
		do {
			System.out.println("1-Deposito  2-Saque  3-Sair ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1: 	
				System.out.println("Quanto deseja depositar?");
				conta.depositar(teclado.nextDouble());
				System.out.println("Saldo depois do deposito: " +conta.valor);
				break;
				
			case 2:
				System.out.println("Quanto deseja sacar?");
				conta.sacar(teclado.nextDouble());
				System.out.println("Saldo apos o saque: " + conta.valor);
				break;
				
			case 3: 
				 System.out.println("Saindo...");
                 return;
				
			default: 
				System.out.println("Opção inválida. Tente novamente.");
				break;
						
			}
		} while (true);
	}

}

package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		ContaBancaria conta = new ContaBancaria ();
		
		System.out.println("Digite o saldo inicial: ");
		conta.setSaldo(teclado.nextDouble());
		System.out.println("Digite o limite inicial: ");
		conta.setLimite(teclado.nextDouble());
		
			
		System.out.println("Quanto deseja sacar?");
		double saque = teclado.nextDouble();
		conta.sacar(saque);
		
		
				
			
		
		}
}
package Exericio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Qual construtor deseja usar? 1 ou 2?");
		int op=teclado.nextInt();
		
		switch(op) {
			case 1:
			try {
			System.out.println("Digite o nome: ");
			Funcionario a1 = new Funcionario (teclado.next());
			}
			catch(Exception e) {
				System.out.println("Erro: " +e.toString());
			}
			break;
			
			case 2:
			try {
			System.out.println("Digite o nome e salario: ");
			Funcionario a2 = new Funcionario (teclado.next(),teclado.nextDouble());
			}
			catch(Exception e) {
				System.out.println("Erro: " +e.toString());
			}
			break;
			
			default:
				System.out.println("Opcao invalida");
				break;
		
		}
	}

}

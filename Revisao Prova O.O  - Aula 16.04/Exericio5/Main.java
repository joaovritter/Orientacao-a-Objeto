package Exericio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Qual construtor deseja usar? 1 ou 2?");
		int op=teclado.nextInt();
		
		switch(op) {
			case 1:
			System.out.println("Digite a marca: ");
			Computador a1 = new Computador (teclado.next());
			break;
			
			case 2:
			System.out.println("Digite o nome, modelo e sistema operacional: ");
			Computador a2 = new Computador (teclado.next(),teclado.next(), teclado.next());
			
			break;
			
			default:
				System.out.println("Opcao invalida");
				break;
		
		}
	}

}

package Exericio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Qual construtor deseja usar? 1 ou 2?");
		int op=teclado.nextInt();
		
		switch(op) {
			case 1:
			System.out.println("Digite o nome: ");
			Animal a1 = new Animal (teclado.next());
			break;
			
			case 2:
			System.out.println("Digite o nome e especie: ");
			Animal a2 = new Animal (teclado.next(),teclado.nextDouble());
			
			break;
			
			default:
				System.out.println("Opcao invalida");
				break;
		
		}
	}

}

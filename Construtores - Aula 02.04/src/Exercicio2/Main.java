package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int opcao;
		System.out.println("1 construtor (nome e idade)  2 construtor (idade)");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome e idade");
			Pessoa p1 = new Pessoa (teclado.next(), teclado.nextInt());
			break;
			
		case 2: 
			System.out.println("Digite a idade");
			Pessoa p2 = new Pessoa (teclado.nextInt());
			break;
		default:
			break;
		}
		
	}

}

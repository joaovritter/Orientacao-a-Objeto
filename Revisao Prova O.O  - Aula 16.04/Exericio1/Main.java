package Exericio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Qual construtor deseja usar? 1 ou 2?");
		int op=teclado.nextInt();
		
		switch(op) {
			case 1:
			System.out.println("Digite o nome do produto: ");
			Produto p1 = new Produto (teclado.next());
			break;
			
			case 2:
			try{
				System.out.println("Digite o nome do produto e preco: ");
				Produto p2 = new Produto (teclado.next(),teclado.nextDouble());
			}
			catch (Exception e) {
				System.out.println("Erro: " + e.toString() );
			}
			
			break;
			
			default:
				System.out.println("Opcao invalida");
				break;
		
		}
	}

}

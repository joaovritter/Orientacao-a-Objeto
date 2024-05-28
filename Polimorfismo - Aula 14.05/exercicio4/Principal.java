package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa c = new Casa();
		int tamanho;
		int quarto;
		int op;
		
		System.out.println("Digite um para calcular sem numero de quartos e 2 para calcular com numero de quartos: ");
		op = sc.nextInt();
		sc.nextLine();
		
		if(op == 1) {
			System.out.println("Digite o tamanho em m² que deseja: ");
			tamanho =sc.nextInt();
			System.out.println(" o valor e: " + c.calcularPreco(tamanho));
		}
		else if (op == 2) {
			System.out.println("Digite o tamanho em m² que deseja: ");
			tamanho =sc.nextInt();
			System.out.println("Digite o numero de quartos: ");
			quarto = sc.nextInt();
			System.out.println("o valor com " + quarto + " e: " + c.calcularPreco(tamanho, quarto));
		}

	}

}

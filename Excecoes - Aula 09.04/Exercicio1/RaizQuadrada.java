package Exercicio1;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n;
	
		try {
			System.out.println("Digite um numero inteiro: ");
			n = teclado.nextInt();
			System.out.println(Math.sqrt(n));
		}catch (Exception e) {
			System.out.println("Erro: " + e.toString()+ "\n\nDigite o numero corretamente: ");
		}
	
	}

}

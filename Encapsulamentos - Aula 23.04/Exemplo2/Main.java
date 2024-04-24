package Exemplo2;

import java.util.Scanner;

public class Main {
		
	
		
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Aluno a1 = new Aluno ();
		String nome;
		Double nota1,nota2;
		
		System.out.println("Digite o nome do caboclo: ");
		a1.setNome(teclado.nextLine());
		System.out.println("Digite a nota 1: ");
		a1.setNota1(teclado.nextDouble());
		System.out.println("Digite a nota 2: ");
		a1.setNota2(teclado.nextDouble());
		
		System.out.println("Aluno: " + a1.getNome());
		System.out.println("Media: " + a1.calculaMedia());

	}

}

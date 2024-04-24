package Exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Pessoa c = new Pessoa ();
		System.out.println("Digite o nome: ");
		c.setNome(teclado.nextLine());
		System.out.println("Digite a idade: ");
		c.setIdade(teclado.nextInt());
		System.out.println("Digite o CPF: ");
		c.setCpf(teclado.nextDouble());
		
		c.verificaMaiorDeIdade();
	
		}
}
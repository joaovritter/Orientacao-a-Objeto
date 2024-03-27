package Exercicio3;

import java.util.Scanner;

import Exercicio1.Disciplina;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Pessoa pessoa1 = new Pessoa ();
		Pessoa pessoa2 = new Pessoa ();
		
	
		System.out.println("Digite nome: ");
		pessoa1.nome = teclado.nextLine();
		System.out.println("Digite email: ");
		pessoa2.email(teclado.nextLine());
		System.out.println("Digite a data de nascimento: ");
		pessoa1.dataNascimento = teclado.nextLine();
		System.out.println("Digite endereco: ");
		pessoa1.endereco = teclado.nextLine();
		pessoa1.admin = true;
		System.out.println("eh admin? "+ pessoa1.admin);
		
		System.out.println("Pessoa 2: ");
		System.out.println("Digite nome: ");
		pessoa2.nome = teclado.nextLine();
		System.out.println("Digite email: ");
		pessoa2.email(teclado.nextLine());
		System.out.println("Digite a data de nascimento: ");
		pessoa2.dataNascimento = teclado.nextLine();
		System.out.println("Digite endereco: ");
		pessoa2.endereco = teclado.nextLine();
		pessoa2.admin = false;
		
		pessoa2.promoverAdmin();
		System.out.println("eh admin? "+pessoa2.admin);
		
		System.out.println("Promovendo a pessoa 2 a admin");
		System.out.println(pessoa2.nome+"eh admin? "+pessoa2.admin);
		
		
	}

}

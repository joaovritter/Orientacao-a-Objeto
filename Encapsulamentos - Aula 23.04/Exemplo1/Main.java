package Exemplo1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome: ");
		p.setNome(teclado.nextLine());
		System.out.println("Digite a Idade: ");
		p.setIdade(teclado.nextInt());
		
		System.out.println("Nome: "+ p.getNome());
		
		System.out.println("Idade: "+ p.getIdade());
	}

}

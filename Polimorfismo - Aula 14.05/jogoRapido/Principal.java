package jogoRapido;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		
		p.DizerOla();
		p.DizerOla(nome);

	}

}

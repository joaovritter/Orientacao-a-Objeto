package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		int op, x;
		String mensagem;
		
		System.out.println("Digite 1 para mensagem fixa e 2 para mensagem repetida: ");
		op = sc.nextInt();
		sc.nextLine();
		
		if(op == 1) {
			System.out.println("Digite a mensagem: ");
			mensagem = sc.nextLine();
			p.Falar(mensagem);
		}
		else if(op== 2) {
			System.out.println("Digite a mensagem: ");
			mensagem = sc.nextLine();
			System.out.println("Digite o numero de vezes para repetir: ");
			x=sc.nextInt();
			p.Falar(mensagem, x);;
		}

	}

}

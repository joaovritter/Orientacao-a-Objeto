package exemplo1;

import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite nome e idade da primeira pessoa: ");
		Pessoa p1 = new Pessoa();
		p1.nome = teclado.nextLine();
		p1.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println(p1.nome + " "+ p1.idade+ " anos");
	
		
		
		System.out.println("digite a idade da segunda pessoa: ");
		Pessoa p2 = new Pessoa();
		p2.nome = teclado.nextLine();
		p2.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println(p2.nome +" "+ p2.idade+ " anos");
		
		System.out.println("digite a idade da terceira pessoa: ");
		Pessoa p3 = new Pessoa();
		p3.nome = teclado.nextLine();
		p3.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println(p3.nome +" "+p3.idade + " anos");
		
		
	}
}

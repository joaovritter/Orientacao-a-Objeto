package exemplo2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.trabalhar();
		
		p = new Programador();
		p.trabalhar();
		
		int op;
		Pessoa pe;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para Pessoa e 2 para Programador");
		op = sc.nextInt();
		
		if(op == 1) {
			pe = new Pessoa();
			pe.trabalhar();
		}
		else if (op == 2) {
			pe = new Programador();
			pe.trabalhar();
		}

	}

}

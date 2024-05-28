package exercicio1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FormaGeometrica f;
		int x, y, op;
		
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y: ");
		y = sc.nextInt();
		
		System.out.println("Digite 1 para Retangulo e 2 para triangulo: ");
		op = sc.nextInt();
		
		if(op==1) {
			f = new FormaGeometrica();
			System.out.println("A area e: " + f.calcularArea(x, y));
		}
		else if (op == 2) {
			f = new Triangulo();
			System.out.println("A a area e: " + f.calcularArea(x, y));
		}
		
		
	}
}

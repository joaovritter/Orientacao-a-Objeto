package Exericio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Qual construtor deseja usar? 1 ou 2?");
		int op=teclado.nextInt();
		
		switch(op) {
			case 1:
			try {
			System.out.println("Digite 1 lado : ");
			Triangulo t1 = new Triangulo (teclado.nextDouble());
			}
			catch(Exception e) {
				System.out.println("Erro: " +e.toString());
			}
			break;
			
			case 2:
			try {
			System.out.println("Digite 3 lados : ");
			double lado1= teclado.nextDouble();
			double lado2=teclado.nextDouble();
			double lado3=teclado.nextDouble();
			
			Triangulo t2 = new Triangulo (lado1,lado2,lado3);
			System.out.println(t2.tipo(lado1, lado2, lado3));
			}
			catch(Exception e) {
				System.out.println("Erro: " + e.toString());
			}
			break;
			
			default:
				System.out.println("Opcao invalida");
				break;
		
		}
	}

}

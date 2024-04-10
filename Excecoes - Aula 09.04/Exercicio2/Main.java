package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Calculadora c = new Calculadora ();
		
		try {
			System.out.println("Digite A e B: ");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c.soma(a,b));
		}catch (Exception e) {
			System.out.println("Erro na soma: " + e.toString());
		}
		
		try {
			System.out.println("Digite A e B: ");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c.sub(a,b));
		}catch (Exception e) {
			System.out.println("Erro na subtracao: " + e.toString());
			
		}
		
		try {
			System.out.println("Digite A e B: ");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c.mult(a,b));
		}catch (Exception e) {
			System.out.println("Erro na multiplicacao: " + e.toString());
		}
		
		try {
			System.out.println("Digite A e B: ");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c.div(a,b));
		}catch (Exception e) {
			System.out.println("Erro na divisao: " + e.toString());
		}
		
		
	}
}

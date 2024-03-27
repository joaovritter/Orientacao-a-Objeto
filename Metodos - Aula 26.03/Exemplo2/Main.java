package Exemplo2;

import java.util.Scanner;

public class Main {
	public static void main (String []args) {
		Calculadora c = new Calculadora();
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite os valores: ");
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
	
		
		double resultado = c.somar(a,b);
		System.out.println("Resultado: "+ resultado);
		
		Calculadora c2 = new Calculadora();
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		resultado = c2.somar(a,b);
		System.out.println("Resultado: " +resultado);
	

	}
}

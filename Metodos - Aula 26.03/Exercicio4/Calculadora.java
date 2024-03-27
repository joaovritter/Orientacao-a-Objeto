package Exercicio4;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		RealizaConta conta = new RealizaConta();
		
		System.out.println("Dois valores para somar: ");
		double soma = conta.soma(teclado.nextDouble(),teclado.nextDouble());
		System.out.println("Soma: "+soma);
		
		System.out.println("Dois valores para subtrair: ");
		double sub = conta.sub(teclado.nextDouble(),teclado.nextDouble());
		System.out.println("Subtracao: "+sub);
		
		System.out.println("Dois valores para multiplicar: ");
		double mult = conta.mult(teclado.nextDouble(),teclado.nextDouble());
		System.out.println("Multiplicacao: "+mult);
		
		System.out.println("Dois valores para dividir: ");
		double div = conta.div(teclado.nextDouble(),teclado.nextDouble());
		System.out.println("Divisao: "+div);
	}

}

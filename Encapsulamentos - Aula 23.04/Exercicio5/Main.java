package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Triangulo c = new Triangulo ();
		System.out.println("Digite o Lado A: ");
		c.setLadoA(teclado.nextDouble());
		System.out.println("Digite o Lado B: ");
		c.setLadoB(teclado.nextDouble());
		System.out.println("Digite o Lado C: ");
		c.setLadoC(teclado.nextDouble());
		
		c.verificaEquilatero();
	
		}
}
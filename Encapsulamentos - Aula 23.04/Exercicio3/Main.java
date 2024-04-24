package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Circulo c = new Circulo ();
		
		System.out.println("Digite o raio: ");
		c.setRaio(teclado.nextDouble());
		System.out.println("A area do circulo eh: "+c.calculaArea());
		
		
				
			
		
		}
}
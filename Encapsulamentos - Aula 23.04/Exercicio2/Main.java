package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Retangulo r = new Retangulo ();
		
		System.out.println("Digite a base: ");
		r.setBase(teclado.nextDouble());
		System.out.println("Digite a Altura: ");
		r.setAltura(teclado.nextDouble());
		System.out.println("A area do circulo eh: "+r.calculaArea());
		
		
				
			
		
		}
}
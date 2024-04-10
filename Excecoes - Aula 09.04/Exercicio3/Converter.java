package Exercicio3;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String a;
		double aInt;
		try {
		System.out.println("Digite alguma coisa: ");
		a=teclado.nextLine();
		aInt = Double.parseDouble(a);
		
		System.out.println("Digitado: " + aInt);
		
		}catch(Exception e) {
			System.out.println("Erro: "+ e.toString());
		}
	}

}

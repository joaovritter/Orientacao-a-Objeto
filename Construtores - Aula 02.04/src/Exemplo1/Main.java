package Exemplo1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String marca, modelo;
		
		System.out.println("Digite a marca e modelo: ");
		marca = teclado.nextLine();
		modelo = teclado.nextLine();
		Carro c1 = new Carro(marca , modelo);
		c1.exibirDados();
		
		System.out.println("Digite a marca e modelo: ");
		marca = teclado.nextLine();
		modelo = teclado.nextLine();
		Carro c2 = new Carro(marca, modelo);
		c2.exibirDados();
		
		
		
	}

}

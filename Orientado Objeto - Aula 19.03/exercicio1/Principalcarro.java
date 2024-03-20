package exercicio1;

import java.util.Scanner;

public class Principalcarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		
		System.out.println("escreve ai a marca, modelo e ano de fabricacao da tua nave ");
		System.out.println("Marca: ");
		car1.marca = teclado.nextLine();
		
		System.out.println("Modelo: ");
		car1.modelo = teclado.nextLine();
		
		System.out.println("Ano de fabricacao: ");
		car1.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		
		System.out.println("escreve ai a marca, modelo e ano de fabricacao da tua segunda nave: ");
		System.out.println("Marca: ");
		car2.marca = teclado.nextLine();
	
		System.out.println("Modelo: ");
		car2.modelo = teclado.nextLine();
	
		System.out.println("Ano de fabricacao: ");
		car2.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Maquina principal: " +car1.marca+", "+car1.modelo+", "+car1.anoFabricacao);
		System.out.println("Maquina secundaria: " +car2.marca+", "+car2.modelo+", "+car2.anoFabricacao);
	}

}

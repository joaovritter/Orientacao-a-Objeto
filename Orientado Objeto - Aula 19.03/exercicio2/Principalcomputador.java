package exercicio2;

import java.util.Scanner;

public class Principalcomputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Computador pc1 = new Computador();
		Computador pc2 = new Computador();
		
		System.out.println("escreve ai a marca, modelo, tipo e preco do pc 1 ");
		System.out.println("Marca: ");
		pc1.marca = teclado.next();
		
		System.out.println("Modelo: ");
		pc1.modelo = teclado.next();
		
		System.out.println("Tipo: ");
		pc1.tipo = teclado.next();
		
		System.out.println("Preco: ");
		pc1.preco = teclado.nextFloat();
		teclado.nextLine();
		
		
	
		pc2.marca = "Acer";
		pc2.modelo = "Aspire Nitro 5";
		pc2.tipo = "Notebook";
		pc2.preco =  4599.90;
		
		System.out.println("Maquina principal: " +pc1.marca+", "+pc1.modelo+", "+pc1.tipo+", R$"+pc1.preco);
		System.out.println("Maquina secundaria: "+pc2.marca+", "+pc2.modelo+", "+pc2.tipo+", R$"+pc2.preco);
	}

}

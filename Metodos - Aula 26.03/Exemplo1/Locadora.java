package Exemplo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
	public static void main (String []args) {
		Carro c = new Carro();
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a marca e o modelo do carro: ");
		String marca, modelo;
		
		c.marca = teclado.next();
		c.modelo = teclado.next();
		c.configurar(c.marca, c.modelo);
		
		ArrayList<String> lista = c.retornar();
		System.out.println("Carro: "+lista);
		
		Moto m1 = new Moto();
		Moto m2 = new Moto();
		System.out.println("Digite a marca, modelo e cilindrada da magrela: ");
		m1.marca = teclado.next();
		m1.modelo = teclado.next();
		m1.cilindrada = teclado.next();
		
		m1.atribuirValor(m1.marca, m1.modelo, m1.cilindrada); 
		
		ArrayList<String> lista1 = m1.retornarValores();
		System.out.println("Moto 1 : "+lista1);
		
		
		
		m2.marca = teclado.next();
		m2.modelo = teclado.next();
		m2.cilindrada = teclado.next();
		
		m2.atribuirValor(m2.marca, m2.modelo, m2.cilindrada); 

		ArrayList<String> lista2 = m2.retornarValores();
		System.out.println("Moto 2 : "+lista2);
	
	}

}

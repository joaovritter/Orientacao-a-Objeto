package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro c = new Carro ();
		
		System.out.println("Digite a Marca: ");
		c.setMarca(teclado.nextLine());
		System.out.println("Digite o Modelo: ");
		c.setModelo(teclado.nextLine());
		System.out.println("Digite o Ano: ");
		c.setAno(teclado.nextInt());
		System.out.println(c.exibeDetalhes());
		
		
				
			
		
		}
}
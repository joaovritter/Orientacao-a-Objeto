package exemplo2;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Laboratorio lab = new Laboratorio();
		System.out.println("Local do laboratorio: ");
		lab.local = teclado.nextLine();
		
		Professor prof = new Professor();
		System.out.println("Nome do professor: ");
		prof.nome = teclado.nextLine();
		
		System.out.println("Local do laboratorio: " + lab.local + ", Nome do professor: "+ prof.nome );
		
		
		
			
	}

}

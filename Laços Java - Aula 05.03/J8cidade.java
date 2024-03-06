package Atividades;
import java.util.Scanner;
public class J8cidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite uma cidade");
		
		for (;;) {
			String n = teclado.nextLine();
			if (n.equals("Sao Paulo")) {
				System.out.println("SP digitado, TCHAU");
				break;
			}
		}
	
	}

}

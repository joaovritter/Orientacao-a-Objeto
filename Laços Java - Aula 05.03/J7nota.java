package Atividades;
import java.util.Scanner;
public class J7nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite uma nota");
		
		for (int i = 0; ; i++) {
			int n = teclado.nextInt();
			if (n==-1) {
				System.out.println("zero digitado, TCHAU");
				break;
			}
		}
	
	}

}

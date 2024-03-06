package Atividades;
import java.util.Scanner;
public class J10media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite um numero");
		float media, soma=0;
		int cont =0;
		for (;;) {
			float n = teclado.nextFloat();
			soma += n;
			cont++;
			if (n==0) {
				System.out.println("zero digitado, TCHAU");
				media = soma/(cont-1);
				System.out.println("media: " +media);
			}
			
		}
	
	}

}

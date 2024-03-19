package VetorMatriz;

import java.util.Scanner;

public class J5menor0 {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 float n[] = new float [10];
	 System.out.println("Digite os 10 numeros: ");
	 for (int i=0; i<10; i++) {
		n[i] = teclado.nextFloat();
		}
	 for (int i =0; i<=10;i++) {
		 if (n[i]<0)
		 System.out.println("Menor que 0: "+n[i]+ "  Posicao: "+i);
	 }
	}
	

}

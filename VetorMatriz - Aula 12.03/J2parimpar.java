package VetorMatriz;

import java.util.Scanner;

public class J2parimpar {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 int n[] = new int [10];
	 System.out.println("Digite os 10 numeros: ");
	 for (int i=0; i<10; i++) {
		n[i] = teclado.nextInt();
		}
	 int par=0, impar=0;
	 for (int i=0; i<10;i++) {
		 if (n[i]%2==0) 
		par++;
	 }
	 for (int i=0; i<10;i++) {
		 if (n[i]%2!=0) 
	     impar++;
	}
	 System.out.println("Pares: "+ par + "  Impares: "+ impar);
	
}
}

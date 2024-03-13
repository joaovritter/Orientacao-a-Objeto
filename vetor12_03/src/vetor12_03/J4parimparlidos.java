package vetor12_03;

import java.util.Scanner;

public class J4parimparlidos {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 int n[] = new int [10];
	 
	System.out.println("Digite os 10 numeros: ");
	 for (int i=0; i<10; i++) {
		n[i] = teclado.nextInt();
		}
	 for (int i=0; i<10;i++) {
		 if (n[i]%2==0) 
		 System.out.println("Pares: "+ n[i]);
	 }
	 for (int i=0; i<10;i++) {
		 if (n[i]%2!=0) 
	     System.out.println("Impares: "+ n[i]);
	}
	
}
}

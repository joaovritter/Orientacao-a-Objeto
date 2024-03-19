package VetorMatriz;

import java.util.Scanner;

public class J1ordemcontraria {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 int n[] = new int [10];
	 System.out.println("Digite os 10 numeros: ");
	 for (int i=0; i<10; i++) {
		n[i] = teclado.nextInt();
		}
	 for (int i =9; i>=0;i--) {
		 System.out.println(n[i]);
	 }
	}
	

}

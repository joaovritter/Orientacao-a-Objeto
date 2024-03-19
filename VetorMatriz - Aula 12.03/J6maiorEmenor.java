package VetorMatriz;

import java.util.Scanner;

public class J6maiorEmenor {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 int n[] = new int [10];
	 System.out.println("Digite os 10 numeros: ");
	 for (int i=0; i<10; i++) {
		n[i] = teclado.nextInt();
		}
	 
	 int maior = -9999;
	 int menor = 9999;
	 for (int i =0; i<10;i++) {
		 
		 if (n[i]>maior)
			 maior = n[i];
		 if (n[i]<menor)
			 menor=n[i];
	 }
	 
	 System.out.println("Maior: "+maior+ "  Menor: "+menor);
	}
	

}

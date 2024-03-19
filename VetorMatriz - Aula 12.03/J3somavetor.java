package VetorMatriz;

import java.util.Scanner;

public class J3somavetor {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 int v1[] = new int [5];
	 int v2[] = new int[5];
	 int vsoma[] = new int[5];
	 
	 System.out.println("Digite os numeros do vetor 1: ");
	 for (int i=0; i<5; i++) {
		v1[i] = teclado.nextInt();
		}
	 
	 System.out.println("Digite os numeros do vetor 2: ");
	 for (int i=0; i<5; i++) {
		v2[i] = teclado.nextInt();
		}
	
	 System.out.println("Soma do vetores: ");
	 for (int i=0; i<5; i++) {
		vsoma[i] = v1[i] + v2[i];
		System.out.println("Soma : "+ vsoma[i]);
		}
	 
	 
	}
}

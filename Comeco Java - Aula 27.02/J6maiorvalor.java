package projeto1;
import java.util.Scanner;

public class J6maiorvalor {
	public static void main(String[] args) {
		System.out.println("6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.");
		Scanner teclado = new Scanner (System.in);
		
		int v1, v2, v3;
		
		System.out.println("Digite 3 valores: ");
		v1 = teclado.nextInt();		
		v2 = teclado.nextInt();
		v3 = teclado.nextInt();
		
		if (v1>v2 && v1>v3) {
			if(v2>v3) {
			 System.out.println("Ordenados: "+v1+" "+v2+" "+v3);
			}
		}
		else if (v1>v2 && v1>v3) {
			if (v3>v2) {
			System.out.println("Ordenados: "+v1+" "+v3+" "+v2);
			}
		}
		else if (v2>v1 && v2>v3) {
			if (v1>v3) {
			System.out.println("Ordenados: "+v2+" "+v1+" "+v3);
			}
		}
		
		else if (v2>v1 && v2>v3) {
			if (v3>v1) {
			System.out.println("Ordenados: "+v2+" "+v3+" "+v1);
			}
		}
		
		else if (v3>v1 && v3>v2) {
			if (v1>v2) {
			System.out.println("Ordenados: "+v3+" "+v1+" "+v2);
			}
		}
		
		else if (v3>v1 && v3>v2) {
			if (v2>v1) {
			System.out.println("Ordenados: "+v3+" "+v2+" "+v1);
			}
		}
 }
}

package VetorMatriz;
import java.util.Scanner;
public class Exemplo1vetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[] numeros = new int[2];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o elemento " +i +":");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
		System.out.println(i + ": " + numeros[i]);
		}
		
		System.out.println("Segunda Parte:\n");
		
		numeros = new int[3];
		for (int i = 0 ; i < numeros.length; i++) {
			System.out.println("Digite o elemento " +i +":");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + ": " + numeros[i]);
			}
		
		
		int n;
		System.out.println("Digite o tamanho do vetor: ");
		n = teclado.nextInt();
		numeros = new int[n];
		
		for (int i = 0 ; i < numeros.length; i++) {
			System.out.println("Digite o elemento " +i +":");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + ": " + numeros[i]);
			}
		
		
		
	}

}
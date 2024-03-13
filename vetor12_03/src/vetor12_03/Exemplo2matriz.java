
package vetor12_03;
import java.util.Scanner;
public class Exemplo2matriz {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int[][] numeros = new int[3][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Digite o elemento ["+i+"] ["+j+"] :");
				numeros[i][j] = teclado.nextInt();
			}
			
		}
		
		System.out.println("Segunda Parte:\n");
		
		numeros = new int[2][2];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Digite o elemento ["+i+"] ["+j+"] :");
				numeros[i][j] = teclado.nextInt();
			}
			
		}
		
		int n, m;
		System.out.println("Digite o tamanho da linha da matriz: ");
		n = teclado.nextInt();
		System.out.println("Digite o tamanho da coluna da matriz: ");
		m = teclado.nextInt();
		
		numeros = new int[n][m];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Digite o elemento ["+i+"] ["+j+"] :");
				numeros[i][j] = teclado.nextInt();
			}
			
		}
		
		
	}

}


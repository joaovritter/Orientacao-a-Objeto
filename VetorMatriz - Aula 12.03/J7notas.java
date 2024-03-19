package VetorMatriz;
import java.util.Scanner;
public class J7notas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int[][] n = new int[3][4];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.println("Digite ["+i+"] ["+j+"] :");
				n[i][j] = teclado.nextInt();
			}
		}
		
			 int maior = n[0][0];
			 int menor = n[0][0];
			 
			 for (int i =0; i<10;i++) {
				 for (int j=0; j<10;j++) {
				 if (n[i][j]>maior)
					 maior = n[i][j];
				 
				 if (n[i][j]<menor)
					 menor=n[i][j];
				 }
			 }
			 
			 System.out.println("Maior: "+maior+ "  Menor: "+menor);
			
		}
		
		
	}




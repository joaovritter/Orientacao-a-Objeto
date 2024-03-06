package Atividades;
import java.util.Scanner;
public class J5fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int fatorial= 1;
	
		System.out.println("Digite um numero inteiro: ");
		int n = teclado.nextInt();
	
		for (int i = 1; i <=n; i++) {
			fatorial = fatorial*i;
		}
		System.out.println(fatorial);
	}

}

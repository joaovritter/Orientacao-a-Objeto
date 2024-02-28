package projeto1;
import java.util.Scanner;
public class J3parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3 - ler um numero e verificar se ele eh par ou impar."); 
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = teclado.nextInt();
		
		if (numero%2==0) 
			System.out.println("O numero "+numero+ " eh par");
		else 
			System.out.println("O numero "+numero+ " eh impar");
		
		
	}

}

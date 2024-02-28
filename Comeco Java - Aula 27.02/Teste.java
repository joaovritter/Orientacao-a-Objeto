package projeto1;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
//		lendo um inteiro
		int n;
		System.out.println("Digite um numero: ");
		n = teclado.nextInt();
		System.out.println("O numero digitado foi: "+n);
		
//		lendo um float
		float f;
		System.out.println("Digite um numero: ");
		f = teclado.nextFloat();
		System.out.println("O numero digitado foi: "+f);
		
//		lendo uma string
		String s;
		System.out.println("Digite uma palavra: ");
		s = teclado.nextLine();
		System.out.println("A palavra digitada foi: "+s);
		
//		lendo um char
		char c;
		System.out.println("Digite uma palavra: ");
		c = teclado.next().charAt(0);
		System.out.println("A palavra digitada foi: "+s);
		
		
	}

}

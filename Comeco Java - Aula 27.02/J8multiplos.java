package projeto1;
import java.util.Scanner;

public class J8multiplos {
	public static void main(String[] args) {
		System.out.println("8 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.n");
	Scanner teclado = new Scanner (System.in);
	
	int n1, n2;
	
	System.out.println("Digite dois valores: ");
	n1 = teclado.nextInt();
	n2 = teclado.nextInt();
	
	if (n1%n2==0) {
		System.out.println(n1+" e " + n2 + " sao multiplos");
	}
	
	else if (n2%n1==0) {
		System.out.println(n2+" e " + n1 + " sao multiplos");
	}
	else {
		System.out.println(n1+" e " + n2 + " nao sao multiplos");
	}
		
	}


}

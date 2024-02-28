package projeto1;
import java.util.Scanner;
public class J4media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4 - Escrever um algoritmo para ler quatro valores inteiros, calcular a sua média, e escrever na tela os que são superiores à média.\n");

		Scanner teclado = new Scanner (System.in);
		
		int n1, n2, n3, n4;
		float media;
		
		System.out.println("digite quatro valores inteiros: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		n4 = teclado.nextInt();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Media total: "+media);
		
		if(n1>media)
			System.out.println(n1+ " eh maior q a media");
		if(n2>media)
			System.out.println(n2+ " eh maior q a media");
		if(n3>media)
			System.out.println(n3+ " eh maior q a media");
		if(n4>media)
			System.out.println(n4+ " eh maior q a media");
		
		
	}

}

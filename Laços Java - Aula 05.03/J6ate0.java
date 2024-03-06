package Atividades;
import java.util.Scanner;
public class J6ate0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite um numero");
		
		for (int i = 0; ; i++) {
			int n = teclado.nextInt();
			if (n==0) {
				System.out.println("zero digitado, TCHAU");
				break;
			}
		}
	
	}

}

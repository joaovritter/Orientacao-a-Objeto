package Atividades;
import java.util.Scanner;
public class J4soma1a100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int soma=0;
		for (int i = 0; i <=100; i++) {
			soma = soma + i;
			System.out.println(soma);
		}
	}

}

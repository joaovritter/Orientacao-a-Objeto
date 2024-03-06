package Atividades;
import java.util.Scanner;
public class J12numeroSOBREn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite um numero");
		float numero, soma=0;
		numero = teclado.nextFloat();
		
		for (float i=1;i<=numero;i++) {
			soma=soma + (1/i);	
			}
		System.out.println(soma);
		}
	}
	

	


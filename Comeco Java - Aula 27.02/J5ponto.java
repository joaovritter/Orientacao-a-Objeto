package projeto1;
import java.util.Scanner;
public class J5ponto {
	public static void main(String[] args) {
		System.out.println("5 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está sobre um dos eixos.\n");
		Scanner teclado = new Scanner (System.in);
		
		int x, y;
		System.out.println("Digite os pontos x e y: ");
		x = teclado.nextInt();
		y = teclado.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("(" + x + "," + y + ")" +" Esta no primeiro quadrante, acima do eixo do X");
		}
		else if (x<0 && y>0) {
			System.out.println("(" + x + "," + y + ")" +" Esta no segundo quadrante, acima do eixo do X");
		}
		
		else if (x<0 && y<0) {
			System.out.println("(" + x + "," + y + ")" +" Esta no terceiro quadrante, abaixo do eixo do X");

		}
		else if (x>0 && y<0) {
			System.out.println("(" + x + "," + y + ")" +" Esta no quarto quadrante, abaixo do eixo do X");

		}
	}
	
}


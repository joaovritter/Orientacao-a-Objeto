package exemplo3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		Calculadora c = new Calculadora();
		
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y: ");
		y = sc.nextInt();
		System.out.println("Digite o valor de z: ");
		z = sc.nextInt();
		
		System.out.println(c.somar(x, y));
		
		System.out.println(c.somar(x, y, z)); 
		
		System.out.println(c.somar(4.4, 5, 6));
		
		double resultado3 = c.somar(3, 7);
		System.out.println(resultado3);
		
		int resultado4 = c.multiplica(5, 6);
		System.out.println(resultado4);
		double resultado5 = c.multiplica(5.5, 4.3);
		System.out.println(resultado5);

	}

}

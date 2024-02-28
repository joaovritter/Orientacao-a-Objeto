package projeto1;
import java.util.Scanner;

public class J9eleitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a idade do eleitor: ");
		int idade;
		idade = teclado.nextInt();
		
		if (idade<16) 
			System.out.println("Nao pode votar");
		
		else if (idade>=16 && idade<18 || idade>70) 
			System.out.println("voto facultativo");
		
		else 
			System.out.println("voto obrigatorio");
		
	
		
	}

}

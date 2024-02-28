package projeto1;
import java.util.Scanner;

public class J1operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1;
		float numero2;
		System.out.println("1 - leitura de dois numeros, faca as quatro operacoes matematicas (Soma, Subtracao, Multiplicacao e divisao)\n");
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite o numero 1: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o numero 2: ");
		numero2 = entrada.nextFloat();
		float resultado;
		
		int operacao; 
		System.out.println("Digite a operacao 1-Soma, 2-Subtracao, 3-Multiplicacao, 4-Divisao: ");
		operacao = entrada.nextInt();
		
		switch(operacao) {
		case 1: 
			if (operacao == 1) {
				System.out.println("Soma: ");
				System.out.println("Resultado: " + (numero1 + numero2));
			}
			break;
		case 2: 
			if (operacao == 2) {
				System.out.println("Subtracao: ");
				System.out.println("Resultado: " + (numero1 - numero2));
			}
			break;
		case 3: 
			if (operacao == 3) {
				System.out.println("Multiplicacao: ");
				System.out.println("Resultado: " + (numero1 * numero2));
			}
			break;
		case 4: 
			if (operacao == 4) {
				System.out.println("Divisao: ");
				System.out.println("Resultado: " + (numero1 / numero2));
			}
			break;
		}
		

	}

}

package projeto1;
import java.util.Scanner;

public class J13imposto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		float salario,total;
		System.out.println("Digite o salario mensal: ");
		salario = teclado.nextFloat();
		
		if(salario<=1566.61) {
			System.out.println("isento de aliquota");
		}
		else if (salario>1566.62 && salario<=2347.85) {
			total = salario + (salario*0.075f);
			System.out.println("Aliquota: "+total+"R$");
		}
		else if (salario>2347.86 && salario<=3130.51) {
			total = salario + (salario*0.15f);
			System.out.println("Aliquota: "+total+"R$");
		}
		else if (salario>3130.52 && salario<=3911.63) {
			total = salario + (salario*0.225f);
			System.out.println("Aliquota: "+total+"R$");
		}
		else if (salario>3911.64) {
			total = salario + (salario*0.275f);
			System.out.println("Aliquota: "+total+"R$");
		}
		
	}

}

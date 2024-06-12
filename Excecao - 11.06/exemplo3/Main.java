package exemplo3;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) throws Excecao {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o deposito:");
		Double deposito = teclado.nextDouble();
		
		System.out.println("Digite o saque:");
		Double saque = teclado.nextDouble();
		
		
		ContaCorrente c = new ContaCorrente(1000,500,2000);
		
		System.out.println("Saldo: " +c.getSaldo());
		System.out.println("Limite: " +c.getLimite());
		
		c.depositar(deposito);
		c.sacar(saque);
		
		System.out.println("Saldo: " +c.getSaldo());
		System.out.println("Limite: " +c.getLimite());
		
				
	}
}

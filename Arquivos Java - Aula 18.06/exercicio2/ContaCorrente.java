package exercicio2;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(double saldo, double valor, double limite) {
		super(saldo, limite);
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}

	public void depositar (double valor) throws Excecao{
		if (valor < 0) {
			throw new Excecao ("Valor deposito negativo!");
		}
		
		else { 
			this.saldo = this.saldo + valor;
			System.out.println("Valor apos deposito:" + this.saldo);
		}
	}
	
	public void sacar (double saldo) throws Excecao{
		
		if (valor < 0) {
			throw new Excecao ("Valor de saque negativo!");
		}
		if (valor > saldo) {
			throw new Excecao ("Saque maior que o Saldo!");
		}
		
		else { 
			this.saldo = this.saldo - valor;
			System.out.println("Valor apos saque:" + this.saldo);
		}
	}

}



package exercicio2;

public class ContaPoupanca extends Conta{
	

	public ContaPoupanca(double saldo, double limite) {
		super(saldo, limite);
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
	
	public void atualizarJuros  (double saldo) {
		saldo = saldo + (saldo*0.03);
	}
}

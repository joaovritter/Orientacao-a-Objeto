package Exercicio1;

public class ContaBancaria {
	private double saldo, limite;

	public ContaBancaria() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar (Double saque) {
		if (saque < saldo+limite) {
			System.out.println("Saque realizado!");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
}

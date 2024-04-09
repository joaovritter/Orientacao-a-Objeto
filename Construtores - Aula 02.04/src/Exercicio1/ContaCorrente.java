package Exercicio1;

public class ContaCorrente {
	public double valor;
	
	public double definirSaldoInicial (double saldo){
		return this.valor = saldo;
	}
	
	public double depositar (double saldo){
		return this.valor = this.valor + saldo;
		
	}
	
	public boolean sacar (double saldo){
		if (this.valor>saldo) {
			this.valor = this.valor - saldo;
			return true;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	
	}

}

package exemplo3;

public abstract class  Conta  {
	 double saldo,limite , valor;
	
	 
	 
	public Conta(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void depositar () {
		
	}
	public void sacar () {
	
	}
}

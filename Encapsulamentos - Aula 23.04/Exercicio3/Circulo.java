package Exercicio3;

public class Circulo {
	private double raio;

	public Circulo() {
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea () {
		return 3.14 *(raio*raio);
	}
}

package Exercicio2;

public class Retangulo {
	private double base, altura;

	public Retangulo() {
		
	}
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double calculaArea () {
		return base*altura;
	}
}

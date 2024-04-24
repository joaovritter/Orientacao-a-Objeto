package Exercicio5;

public class Triangulo {
	private double ladoA, ladoB, ladoC;
	

	public Triangulo() {
		
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}


	public void verificaEquilatero () {
		if (ladoA==ladoB && ladoA==ladoC) {
			System.out.println("eh equilatero");
		}	
		else {
		System.out.println("nao eh equilatero");
		}
	}
}

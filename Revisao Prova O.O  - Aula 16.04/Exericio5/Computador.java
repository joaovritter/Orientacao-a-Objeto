package Exericio5;

public class Computador {
	String marca;
	String modelo;
	String so;
	
	public Computador (String nome) {
		this.marca = marca;
		System.out.println("marca: " + this.marca);
	}
	
	public Computador (String marca, String modelo, String so) {
		this.marca = marca;
		this.modelo = modelo;
		this.so=so;
		System.out.println("marca: " + this.marca+ "modelo: " + this.modelo+ "Sistema Operacional: " + this.so);
	}
}

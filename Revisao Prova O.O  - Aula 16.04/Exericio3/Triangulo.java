package Exericio3;

public class Triangulo {
	double lado1,lado2,lado3;
	
	
	public Triangulo (double lado1) {
		this.lado1 = lado1;
		System.out.println("Triangulo Equilatero");
	}
	
	public Triangulo (double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		System.out.println("Lado 1 : " + this.lado1+ "Lado 2: " + this.lado2+ "Lado 3: " + this.lado3);
	}
	 
	public String tipo(double lado1, double lado2, double lado3) {
	        if (lado1 == lado2 && lado2 == lado3) {
	            return "Equilatero";
	        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            return "Isosceles";
	        } else {
	            return "Escaleno";
	        }
	    }
}

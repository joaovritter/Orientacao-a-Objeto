package Exemplo1;

public class Carro {
	String marca;
	String modelo;
	
	public Carro(String modeloCarro) {
		modelo = modeloCarro;
	}
		
	public Carro(String marcaCarro, String modeloCarro) {
		modelo = modeloCarro;
		marca = marcaCarro;
		
	}
	public void exibirDados() {
		System.out.println("Carro: "+marca+"\nModelo: "+modelo );
	}

}

package Exercicio4;

public class Carro {
	private String marca, modelo;
	private int ano;

	public Carro() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String exibeDetalhes () {
		
		return "Marca: "+marca +" | Modelo: " +modelo +" | Ano: "+ano;
	}
}

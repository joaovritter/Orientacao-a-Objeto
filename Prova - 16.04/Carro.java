package ProvinhaShowDeBola;

public class Carro {
	public String marca;
	public String modelo;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
		System.out.println(marca);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
		System.out.println(modelo);
	}
	
	
	
	public Carro(String marca) {
		this.marca = marca;
		
	}
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	public void atribuirMarca(String marca) {
		System.out.println("Digite a marca do carro:");
		this.marca = marca;
	}

	public Boolean mostrarMarca(String marca) {
		if (!marca.isEmpty() ) {
		System.out.println("Marca: "+marca);
		}
		else {
			System.out.println("Nenhum Carro cadastrado!");
		}
	return false;		
	}
	
	public void atribuirMarcaModelo(String marca, String modelo) {
		System.out.println("Digite a marca e modelo do carro:");
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Boolean mostrarMarcaModelo(String marca, String modelo) {
		if (!marca.isEmpty() && !modelo.isEmpty()) {
		System.out.println("Marca: "+marca+ "   Modelo: "+modelo);
		}
		else {
			System.out.println("Nenhum Carro cadastrado!");
		}
	return false;		
	}
	

	

}

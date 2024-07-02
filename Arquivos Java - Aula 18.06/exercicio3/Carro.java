package exercicio3;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("500 por hora ja");
	}
	@Override
	public void frear() {
		System.out.println("segura peao");
		
	}

	
}

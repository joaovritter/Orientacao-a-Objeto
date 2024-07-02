package exercicio3;

public class Moto extends Veiculo{

	public Moto(String marca, String modelo, int ano) {
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

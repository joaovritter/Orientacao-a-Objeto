package exercicio3;

public class Gato extends Animal{

	public Gato(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("MIAAAAU");
	}

}

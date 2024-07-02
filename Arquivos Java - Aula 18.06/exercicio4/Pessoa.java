package exercicio4;

public abstract class Pessoa {
	private String nome, cidade;

	
	public Pessoa(String nome, String cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}


	public abstract void efetuarCompra ();
}

package exercicio11;

public class Pessoa {
	private String nome; 
	private int idade;

	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public void validarIdade() throws MinhaExcecao{
		if (this.idade<0 || this.idade>120) {
			throw new MinhaExcecao ("Idade nao permitida");
		}
		else System.out.println("Tu tem "+this.idade+" anos");
	}

}

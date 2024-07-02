package exercicio8;

public class CD implements Produto {
	protected String nome, descricao;
	protected double preco;


	public CD(String nome, String descricao, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public void getNome() {
		System.out.println("Nome: " +this.nome);

	}

	@Override
	public void getPreco() {
		System.out.println("Preco: " +this.preco);

	}

	@Override
	public void getDescricao() {
		System.out.println("Descricao: " +this.descricao);

	}

}

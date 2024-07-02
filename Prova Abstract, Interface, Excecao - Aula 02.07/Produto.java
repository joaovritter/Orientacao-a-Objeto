package pacotao;

public abstract class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public abstract void atualizarQuantidade(int novaQuantidade) throws QuantidadeInvalidaException;

	public void exibirDetalhes() {
		System.out.println("Produto - " + nome + ", Preco: R$" + preco + ", Quantidade: " + quantidade); 
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public int setQuantidade(int quantidade) {
		return this.quantidade = quantidade;
	}
	
}

package Exericio1;

public class Produto {
	String nome;
	double preco;
	
	public Produto (String nome) {
		this.nome = nome;
		System.out.println("Nome: " + this.nome);
	}
	
	public Produto (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		System.out.println("Nome: " + this.nome+ "Preco: " + this.preco);
	}
}

package Exemplo1;
//usa-se get/set quando os atributos sao privados
//assim podemos modifica-los indiretamente
//padronizar utilizacao de atributos privados
public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
	}

	public String getNome() { // retorna o valor de nome e poe no atributo
		return nome; 
	}

	public void setNome(String nome) { //seta o nome q foi digitado na main
		this.nome = nome; // atribui o nome ao atributo nome (this.nome)
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

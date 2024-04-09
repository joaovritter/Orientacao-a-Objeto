package Exercicio2;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa (String nomeP, int idadeP) {
		this.nome = nomeP;
		this.idade = idadeP;
		System.out.println("Nome: "+ nome +"  Idade: "+idade);
		
	}
	
	public Pessoa (int idadeP) {
		this.idade = idadeP;
		System.out.println("Idade: "+idade);
		
	}

}

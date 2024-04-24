package Exercicio6;

public class Pessoa {
	private String nome;
	private int idade;
	private double cpf;

	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}



	public void verificaMaiorDeIdade () {
		if (idade>=18) {
			System.out.println(nome+" ja pode ser preso");
		}	
		else {
		System.out.println(nome +" eh pirralho ainda");
		}
	}
}

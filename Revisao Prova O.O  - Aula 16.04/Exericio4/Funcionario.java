package Exericio4;

public class Funcionario {
	String nome;
	double salario;
	
	public Funcionario (String nome) {
		this.nome = nome;
		System.out.println("Nome: " + this.nome);
	}
	
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		System.out.println("Nome: " + this.nome+ "salario: " + this.salario);
	}
}

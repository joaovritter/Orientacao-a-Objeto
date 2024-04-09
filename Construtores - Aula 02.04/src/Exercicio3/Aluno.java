package Exercicio3;

public class Aluno {
	public String nome;
	public int matricula;
	public String dataNascimento;
	public int ano;
	
	public Aluno (String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		System.out.println("Nome: "+nome+ " Matricula: "+matricula);
	}
	
	public Aluno (String dataNascimento) {
		this.dataNascimento = dataNascimento;
		System.out.println("Data de nascimento: "+dataNascimento);
	
	}
	
	public Aluno (String nome, String dataNascimento, int ano) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.ano = ano;
		System.out.println("Nome: "+nome+ " Data de nascimento: "+dataNascimento+ " Ano que entrou:"+ano);
	}
}

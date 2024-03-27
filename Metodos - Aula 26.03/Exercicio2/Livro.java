package Exercicio2;

public class Livro {
	String titulo = "Joao pe de feijao";
	String autor = "Eu";
	int anoPubli = 2025;
	String genero = "Masculino";
	Boolean emprestado = false;
	
	
	public String retornar() {
		return titulo+" "+autor+" "+anoPubli+" "+genero+" "+emprestado;
	}
	public Boolean emprestimo() {
	emprestado = true;
	return emprestado;
	}
	public Boolean devolucao () {
		emprestado = false;
		return emprestado;
	}
}



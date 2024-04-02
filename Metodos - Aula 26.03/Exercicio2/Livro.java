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
	public void emprestimo() {
		if (!emprestado){
			emprestado = true;
			System.out.println ("Livro disponivel");
		}
		else {
			System.out.println ("livro nao disponivel");
		}
	}
	public devolucao () {
		if(emprestado){
			emprestado = false;
			System.out.println ("Livro devolvido");
		}
		else {
			System.out.println ("livro nao pode ser devolvido");
		}
	}
}



package Exercicio5x2;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("Joao pe de feijao", "Eu", 2025, "Masculino", false);
		System.out.println(livro.titulo+" "+livro.autor+" "+livro.anoPubli+" "+livro.genero+" "+livro.emprestado);
		livro.emprestimo();
		System.out.println("O livro esta emprestado? "+livro.emprestado);
		
		livro.devolucao();
		System.out.println("Quer devolver? "+livro.emprestado);
		
	}

}

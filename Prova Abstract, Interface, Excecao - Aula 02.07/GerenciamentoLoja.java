package pacotao;

public class GerenciamentoLoja {

	public static void main(String[] args) throws QuantidadeInvalidaException {
		// TODO Auto-generated method stub
		Livro l = new Livro("Joao pe de feijao", 150, 4, "Joao Escrituras" );
		Revista r = new Revista("Globo Joao Esporte", 39, 10,"Joao Bonner Hulk");
		l.exibirDetalhes();
		System.out.println("Atualizando Quantidade de Livros: ");
		l.atualizarQuantidade(1);
		l.exibirDetalhes();
		System.out.println("Aplicando Descontinho da Semana dos Livros que nao vende: ");
		r.aplicarDesconto(0.9);
		r.exibirDetalhes();
		
		System.out.println("\nAgora com a Revista: \n");
		
		r.exibirDetalhes();
		System.out.println("Atualizando Quantidade de Revistas: ");
		r.atualizarQuantidade(-3);
		System.out.println("Aplicando Descontinho da Semana das revistas mais vendidas: ");
		r.aplicarDesconto(0.2);
		r.exibirDetalhes();
		
	}

}

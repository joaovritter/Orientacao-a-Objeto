package pacotao;

public class Livro extends Produto implements Descontavel{
	public String autor;
	public int novaQuantidade;
	
	public Livro(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor=autor;
	}

	@Override
	public void atualizarQuantidade(int novaQuantidade)throws QuantidadeInvalidaException {
		if (quantidade <0 || novaQuantidade<0) {
			throw new QuantidadeInvalidaException ("Quantidae Invalida");
		}
		else {
			quantidade = novaQuantidade;
		}
	}
	
	@Override
	public void aplicarDesconto(double percentual) {
		preco = preco - (preco*percentual);
	}

	
}

package pacotao;

public class Revista extends Produto implements Descontavel{
	public String editora;
	public int novaQuantidade;
	
	public Revista(String nome, double preco, int quantidade, String editora) {
		super(nome, preco, quantidade);
		this.editora = editora;
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
		percentual = 0.1;
		preco = preco - (preco*percentual);
	}

}

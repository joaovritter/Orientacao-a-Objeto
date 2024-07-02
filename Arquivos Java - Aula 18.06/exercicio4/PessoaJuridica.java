package exercicio4;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public PessoaJuridica(String nome, String cidade, String cnpj) {
		super (nome,cidade);
		this.cnpj = cnpj;
	}

	@Override
	public void efetuarCompra() {
		System.out.println("pessoa de cpf:"+this.cnpj+" efetuou a compra");
		
	}

}

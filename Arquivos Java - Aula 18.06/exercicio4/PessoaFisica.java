package exercicio4;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica(String nome, String cidade, String cpf) {
		super (nome,cidade);
		this.cpf = cpf;
	}

	@Override
	public void efetuarCompra() {
		System.out.println("pessoa de cpf:"+this.cpf+" efetuou a compra");
		
	}

}

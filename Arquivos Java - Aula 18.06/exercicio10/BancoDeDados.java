package exercicio10;

public class BancoDeDados implements AcessoDados {

	public BancoDeDados() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectar() {
		System.out.println("Conectando ao Banco de Dados");

	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do Banco de Dados");

	}

	@Override
	public void inserir() {
		System.out.println("Inserindo ao Banco de Dados");

	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando o Banco de Dados");

	}

	@Override
	public void excluir() {
		System.out.println("Excluindo o Banco de Dados");
	}

}

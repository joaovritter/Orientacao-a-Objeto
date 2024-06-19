package TrabalhoFinal;

public class Produto {
	private String codigo, descricao;
	private Double precoCusto, precoVenda;
	private int estoqueDisponivel;
	
	public Produto(String codigo, String descricao, Double precoCusto, Double precoVenda, int estoqueDisponivel) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.estoqueDisponivel = estoqueDisponivel;
	}
	
	
	
}

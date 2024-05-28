package provapkg;

public class Evento {
	protected String nome;
	protected String ingresso;
	
	public Evento(String nome, String ingresso) {
		super();
		this.nome = nome;
		this.ingresso = ingresso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngresso() {
		return ingresso;
	}
	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	
	public String adicionar (String nome) {
		return nome;
	}
	public String cancelar (String nome) {
		return nome;
	}
}

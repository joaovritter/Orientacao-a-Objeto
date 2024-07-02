package exercicio12;

public class Data {
	protected int dia, mes ,ano;
	
	
	public Data(int dia, int ano, int mes) {
		super();
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
	}
	
	public void validarData() {
		if (this.mes < 1 || this.mes > 12) {
			throw new IllegalArgumentException ("Mes invalido");
		}
		
		if (this.dia <1 || this.dia>31) {
			throw new IllegalArgumentException ("Dia invalido");
		}
		
		if (this.ano <1 || this.ano>2024) {
			throw new IllegalArgumentException ("Ano invalido");
		}
	}
	
}

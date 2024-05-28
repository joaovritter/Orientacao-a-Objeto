package exercicio4;

public class Casa {
	
	public int calcularPreco(int tamanho) {
		return 1500 * tamanho;
	}
	public int calcularPreco(int tamanho, int quartos) {
		if(quartos > 2) {
			return (3000 * tamanho);
		}
		else {
			return (1500 * tamanho);
		}
	}
}

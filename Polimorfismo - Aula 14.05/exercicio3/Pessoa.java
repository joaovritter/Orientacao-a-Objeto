package exercicio3;

public class Pessoa {
	public void Falar(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void Falar(String mensagem, int x) {
		for(int i = 0; i < x; i++) {
			System.out.println(mensagem);
		}
	}
}

package exemplo2;
import exemplo2.MinhaExcecao;

public class Main {
	
	private static void divide (int n1, int n2) throws MinhaExcecao  {
		if (n2==0) {
			throw new MinhaExcecao ("Imposivel dividir por 0");
		}
		else {
			System.out.println("Divisao: " + (n1/n2));
		}
	}
	
	public static void main(String[] args) throws MinhaExcecao {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 0;
		divide(n1,n2);
		
	
	}

}

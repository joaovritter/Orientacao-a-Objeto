package Exemplo1;

public class Main {

	public static void main(String[] args) {

		try {
		int[] numeros = {1,2,3};
		System.out.println(numeros[3]); // ArrayIndexOutOfBoundsException
	    }catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Erro: " + e.getMessage());
	}catch (Exception e) {
	    	System.out.println("Excecao: " + e.toString());
	    }
	}
}

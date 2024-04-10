package Exemplo2;

public class Main {

	public static void main(String[] args) {
		//Exemplo 2: Divisao por zero
		try {
			int a = 10, b = 0;
		System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Erro: "+ e.toString());
		}
		//Exemplo 3: Converter string para numero
		try {
			String numero = "abc";
			int valor = Integer.parseInt(numero);
			} catch (Exception e) {
				System.out.println("Erro: "+ e.toString());
			}
	}

}

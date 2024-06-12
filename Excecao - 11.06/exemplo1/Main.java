package exemplo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numeros = {1,2,3};
			System.out.println(numeros[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: indice fora do array\n"+ e.getMessage());
		}catch (Exception e) {
			System.out.println("Excessao: "+e.toString());
		}
	
		
//		int a = 10;
//		int b = 0;
//		System.out.println(a/b);
		
//		String numero = "abc";
//		int valor = Integer.parseInt(numero); //NumberFormatException 
	}

}
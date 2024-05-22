package exemplo3;

public class Principal {

	public static void main(String[] args) {
		Produto produto1 = new Produto ("caneta",19);
		Produto produto2 = produto1.clone();
	
		System.out.println("1- Nome: " + produto1.getNome()+ "  Preco:  "+produto1.getPreco());
		System.out.println("2- Nome:" + produto2.getNome()+ "  Preco: "+ produto2.getPreco());
		 
		produto2.setPreco(2.3);// passando os valores para o novo objeto
		
		System.out.println("1 = " + produto1.getNome()+ "  Preco:  "+produto1.getPreco());
		System.out.println("2 = " + produto2.getNome()+ "  Preco: "+ produto2.getPreco());
		 
		if (produto1==produto2) {
			System.out.println("Sao iguais"); //retornando this, logo retorna o produto1 clonado
	
		}
		else {
			System.out.println("Sao diferentes"); //retornando um novo objeto e dps passsando os valores
		}
		
	}	
	
	

}

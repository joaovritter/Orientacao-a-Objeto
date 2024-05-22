package exemplo2;

public class Principal {

	public static void main(String[] args) {
		Endereco endereco = new Endereco ("Rua pqp",69);
		Pessoa pessoa = new Pessoa ("joao",19, endereco);
		
		System.out.println("Nome: "+pessoa.getNome()+"  Idade: " +pessoa.getIdade());
		System.out.println("Endereco: "+ pessoa.getEndereco().getRua() + " "+ pessoa.getEndereco().getNumero());
		
		System.out.println("\n");
		//da pra fazer assim tambem sem instanciar o obj endereco
		
		Pessoa pessoa2 = new Pessoa ("Joao",71, new Endereco ("Rua do quinca",1456352));
		System.out.println("Nome: "+pessoa.getNome()+"Idade: " +pessoa.getIdade());
		System.out.println("Endereco: "+ pessoa.getEndereco().getRua() + " "+ pessoa.getEndereco().getNumero());
	}	
}

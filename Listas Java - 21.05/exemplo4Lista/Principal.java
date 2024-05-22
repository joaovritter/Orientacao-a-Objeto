package exemplo4Lista;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void exibirPessoa (List<Pessoa> listaPessoa) {
		for (Pessoa p:listaPessoa) {
			System.out.println("Nome: "+ p.getNome()+ " | Idade: "+ p.getIdade());
			
		}
	}

	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa ("Joao normal",19);
		Pessoa p2 = new Pessoa ("Marcelo Idoso",32);
		Pessoa p3 = new Pessoa ("wendel jovem",17);
		
		listaPessoa.add(p1);
		listaPessoa.add(p2);
		listaPessoa.add(p3);
		
		exibirPessoa(listaPessoa);
	}
	
}


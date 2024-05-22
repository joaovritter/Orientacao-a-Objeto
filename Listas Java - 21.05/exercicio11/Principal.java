package exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static int qtdMulheres (List<Pessoa> listaPessoa) {
		int cont=0;
		for (Pessoa p:listaPessoa) {
			if (p.getSexo()=='F') {
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa ("Joao normal",19,'M');
		Pessoa p2 = new Pessoa ("Marcela",32,'F');
		Pessoa p3 = new Pessoa ("wendel jovem",17,'M');
		Pessoa p4 = new Pessoa ("Joana",78,'F');
		
		listaPessoa.add(p1);
		listaPessoa.add(p2);
		listaPessoa.add(p3);
		listaPessoa.add(p4);
		
		System.out.println("Quantidade de Mulheres: "+qtdMulheres(listaPessoa) ); 
	}
	
}


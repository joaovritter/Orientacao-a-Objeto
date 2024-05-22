package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void exibirPessoa (List<Produto> listaP) {
		for (Produto p:listaP) {
			System.out.println("Nome: "+ p.getNome()+ " | preco: R$"+ p.getPreco()+" | Qtd: "+p.getQuantidade());
			
		}
	}

	public static void main(String[] args) {
		List<Produto> listaP = new ArrayList<Produto>();
		Produto p1 = new Produto ("PC bomba",20000.0,2);
		Produto p2 = new Produto ("PC de mesa com mesa, rato com fio, memoria ra",324444,1);
		Produto p3 = new Produto ("Mouse gamer com fio sem fio",1732.99,89);
		
		listaP.add(p1);
		listaP.add(p2);
		listaP.add(p3);
		
		exibirPessoa(listaP);
	}
	
}


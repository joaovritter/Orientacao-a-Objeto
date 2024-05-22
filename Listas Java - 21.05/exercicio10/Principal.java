package exercicio10;

import java.util.ArrayList;
import java.util.List;

import exercicio12.Livro;

public class Principal {
	
	public static void exibir (List<Aluno> lista) {
		for (Aluno a : lista) {
			System.out.println("Aluno: "+a.getNome()+ " | Nota 1: "+a.getNota1()+" | Nota 2: "+a.getNota2());
			
		}
	}
	
	public static void media (List<Aluno> lista) {
		for (Aluno aluno :lista) {
			double media = (aluno.getNota1()+aluno.getNota2())/2;
			if (media >=6) {
				System.out.println(aluno.getNome()+" aprovado, media "+ media);
			}
			else {
				System.out.println("Media do "+aluno.getNome()+" corno reprovado: "+ media);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno a1 = new Aluno ("Joao",10,3);
		Aluno a2 = new Aluno ("Marcelo",5,3);
		Aluno a3 = new Aluno ("Wendel",5,9);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		exibir(lista);
		media(lista);
		
	
		
	}
	
}


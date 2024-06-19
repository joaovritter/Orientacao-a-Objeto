package TrabalhoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Produto a1 = new Produto ("Joao",15);
			Produto a2 = new Produto ("Maria",12);
			Produto a3 = new Produto ("Pedro",14);
			List<Produto> lista = new ArrayList<Produto>();
			Arquivo arquivo = new Arquivo ("alunos");
			arquivo.gravarArquivo(a1);
			arquivo.gravarArquivo(a2);
			arquivo.gravarArquivo(a3);
			
			lista = arquivo.lerArquivo();
			
			for (Produto a : lista) {
				System.out.println("Nome: "+a.getNome()+" Idade:"+a.getIdade());
			}
	}

}

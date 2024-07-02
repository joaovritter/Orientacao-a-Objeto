package exemplo2;

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
			Aluno a1 = new Aluno ("Joao",15);
			Aluno a2 = new Aluno ("Maria",12);
			Aluno a3 = new Aluno ("Pedro",14);
			List<Aluno> lista = new ArrayList<Aluno>();
			Arquivo arquivo = new Arquivo ("alunos");
			arquivo.gravarArquivo(a1);
			arquivo.gravarArquivo(a2);
			arquivo.gravarArquivo(a3);
			
			lista = arquivo.lerArquivo();
			
			for (Aluno a : lista) {
				System.out.println("Nome: "+a.getNome()+" Idade:"+a.getIdade());
			}
	}

}

package exemplo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Aluno a1 = new Aluno ("Joao",15);
			Aluno a2 = new Aluno ("Maria",12);
			Aluno a3 = new Aluno ("Pedro",14);
			
			try {
				FileWriter arquivo = new FileWriter ("alunos.txt"); // ler desse arquivo
				BufferedWriter escritor = new BufferedWriter(arquivo); // escrever em arquivo
				
				escritor.write (a1.getNome()+","+a1.getIdade());
				escritor.newLine();
				
				escritor.write (a2.getNome()+","+a2.getIdade());
				escritor.newLine();
				
				escritor.write (a3.getNome()+","+a3.getIdade());
				escritor.newLine();
				
				escritor.close(); //so vai escrever msm dps de fechar o escritor
				arquivo.close(); // e dps de fechar o arquivo
				System.out.println("Alunos salvos no arquivo");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileReader arquivo = new FileReader ("alunos.txt"); // ler desse arquivo
				BufferedReader leitor = new BufferedReader(arquivo); // escrever em arquivo
				String linha;
				while ((linha = leitor.readLine())!=null) {
					String[] campos = linha.split(","); //cria um vetor de string splitando , entre cada linha (nome e dps idade)
					
					String nome = campos[0]; //atribui o nome a posicao 0
					int idade = Integer.parseInt(campos[1]); //atribui idade a posicao 1 e converte para int ja q é um vetor de string
					
					Aluno aluno = new Aluno(nome,idade);
					System.out.println("Nome: "+aluno.getNome() + "  Idade: "+ aluno.getIdade());
				}
				leitor.close();
				arquivo.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}

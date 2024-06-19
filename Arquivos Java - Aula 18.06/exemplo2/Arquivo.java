package exemplo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Aluno> listAluno;
	public String nomeArquivo;
	
	public Arquivo (String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listAluno = new ArrayList<>();
	}
	
	public void gravarArquivo(Aluno a) {
		try {
			arqw = new FileWriter (nomeArquivo+".txt", true); //true para o append, vai sempre sobrecarregar o arquivo, botando os nomes em baixo
			escritor = new BufferedWriter (arqw);
			escritor.write(a.getNome()+","+a.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
			System.out.println("Alunos salvos no arquivo!");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> lerArquivo () {
		System.out.println("Alunos lidos do arquivo:");
		try {
			arqr = new FileReader(nomeArquivo+".txt");
			leitor = new BufferedReader (arqr);
			String linha;
			while ((linha = leitor.readLine())!= null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				Aluno aluno = new Aluno (nome,idade);
				listAluno.add(aluno);
			}
			leitor.close();
			arqr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return listAluno;
	}
}

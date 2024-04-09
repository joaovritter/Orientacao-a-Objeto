package Exercicio5x1;

public class Disciplina {
	String nome;
	int cargaHoraria;
	String nomeProf;
	
	public Disciplina (String nome, int cargaHoraria, String nomeProf) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.nomeProf = nomeProf;
	}
	
	public void atribuir(String disciplina, int cargaH, String professor) {
		nome = disciplina;
		cargaHoraria = cargaH;
		nomeProf = professor;
	}
	
	public String retornar() {
		return nome+" "+cargaHoraria+" "+nomeProf;
	}
}



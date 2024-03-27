package Exercicio1;

public class Disciplina {
	String nome = "Orientacao a objeto";
	int cargaHoraria = 80;
	String nomeProf = "Ricardo";
	
	public void atribuir(String disciplina, int cargaH, String professor) {
		nome = disciplina;
		cargaHoraria = cargaH;
		nomeProf = professor;
	}
	
	public String retornar() {
		return nome+" "+cargaHoraria+" "+nomeProf;
	}
}



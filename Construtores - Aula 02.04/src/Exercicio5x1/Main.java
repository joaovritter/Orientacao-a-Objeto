//1) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir e recuperar esses valores. Mostre na tela:
//a) O conteúdo original dos atributos
//b) A opção para o usuário inserir os valores
//c) A exibição do novo conteúdo dos atributos

package Exercicio5x1;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		Disciplina disciplina = new Disciplina ("Orientacao a objeto", 80, "Ricardo");
		
		//mostrando o conteudo original dos atributos 
		System.out.println(disciplina.nome+", "+disciplina.cargaHoraria+" horas, Professor(a)"+ disciplina.nomeProf );
		
		System.out.println("Digite a disciplina, carga horaria e professor: ");
		disciplina.nome = teclado.nextLine();
		disciplina.cargaHoraria = teclado.nextInt();
		teclado.nextLine();
		disciplina.nomeProf = teclado.nextLine();
		
		//mostrando o conteudo alterado dos atributos 
		System.out.println(disciplina.nome+", "+disciplina.cargaHoraria+" horas, Professor(a)"+ disciplina.nomeProf );
		
		

		
	}
}

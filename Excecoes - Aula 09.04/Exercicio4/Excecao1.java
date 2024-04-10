//NumberFormatException:conversão de string para numérico falha devido a um formato inválido da string.
//
//NullPointerException: tenta acessar ou chamar métodos em um objeto que é null.
//
//ArrayIndexOutOfBoundsException: quando tenta acessar um índice inválido em um array.
//
//ArithmeticException: quando ocorre uma condição de erro aritmético, como divisão por zero.
//
//FileNotFoundException: tentar abrir um arquivo que não existe ou não pode ser encontrado.
//
//IOException: Uma classe base para exceções relacionadas a operações de entrada/saída.
//
//ClassNotFoundException: tentar carregar uma classe usando o método Class.forName(), mas a classe não pode ser encontrada no classpath.
//
//InterruptedException: Gerada quando uma thread em espera é interrompida.
//
//IllegalArgumentException: Ocorre quando um método é passado com um argumento ilegal.
//
//IllegalStateException: quando o estado de um objeto é inválido para a operação que está sendo executada.
package Exercicio4;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Excecao1 {
	public static void main(String[] args) {	
//ArithmeticException
		try {
			int a = 10, b = 0;
		System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Erro: "+ e.toString());
		}
	
//FileNotFoundException
		String nomeArquivo = "arquivo.txt"; // Nome de arquivo inválido
        try {
            FileReader arquivo = new FileReader(nomeArquivo); // Ler arquivo 
            System.out.println("Arquivo encontrado: " + nomeArquivo);
            arquivo.close();
        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo: " + e.toString());
        }
	  }
}



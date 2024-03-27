package Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Moto {
	String marca;
	String modelo;
	String cilindrada;



	public void atribuirValor(String marcaM, String modeloM, String cilindradaM) {
		String marca = marcaM;
		String modelo = modeloM;
		String cilindrada = cilindradaM;
 
	}


	public ArrayList<String> retornarValores() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(marca);
		lista.add(modelo);
		lista.add(cilindrada);
		return lista;
	}
}	
		
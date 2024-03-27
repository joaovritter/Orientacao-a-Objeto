package Exemplo1;

import java.util.ArrayList;

public class Carro {
	public String modelo;
	public String marca;
	
	public void configurar(String marcaCarro, String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}

	public ArrayList<String> retornar(){
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(marca);
		lista.add(modelo);
		return lista;
		
	}
}
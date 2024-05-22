package exercicio13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	public static void maiorSaldo (List<Conta> lista) {
		double maiorSaldo = -99999;
		int numero = 0;
		String titular = "a";
		 for (Conta conta : lista) {
	            if (conta.getSaldo() > maiorSaldo) {
	            	maiorSaldo = conta.getSaldo();
	            	titular = conta.getTitular();
	            	numero = conta.getNumero();
	            }
         	}
		 System.out.println("Conta com maior saldo: "+numero);
		 System.out.println("Titular: "+titular);
		 System.out.println("Saldo: R$"+maiorSaldo);     
		}
	

	public static void main(String[] args) {
		List<Conta> listaP = new ArrayList<Conta>();
		Conta p1 = new Conta (123,"Joao Ritter",20000);
		Conta p2 = new Conta (777,"Joao dos Santos",50000);
		Conta p3 = new Conta (1234,"Joao Vitor",150500);
		
		listaP.add(p1);
		listaP.add(p2);
		listaP.add(p3);
		
		maiorSaldo(listaP);
		
	}
	
}


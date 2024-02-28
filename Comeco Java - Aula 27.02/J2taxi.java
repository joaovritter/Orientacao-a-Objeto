package projeto1;
import java.util.Scanner;
public class J2taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float combustivel = 4.90f;
	float odometroInicio, odometroFinal, odometroTotal, litros;
	float valor;
	float mediaKml, lucro;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Odometro inicio do dia: ");
	odometroInicio = teclado.nextFloat();
	
	System.out.println("Odometro final do dia: ");
	odometroFinal = teclado.nextFloat();
	
	odometroTotal = odometroFinal - odometroInicio;
	
	System.out.println("litros de combustivel gasto: ");
	litros = teclado.nextFloat();
	
	System.out.println("Valor em R$ recebido dos passageiros:");
	valor = teclado.nextFloat();
	
	mediaKml= (odometroTotal/litros);
	System.out.println("Media: "+ mediaKml +"Km/l");
	
	lucro = valor - (odometroTotal*combustivel);
	System.out.println("Lucro total do dia: "+lucro + "R$");
	
	}

}

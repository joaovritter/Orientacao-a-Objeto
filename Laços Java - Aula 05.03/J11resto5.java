package Atividades;
import java.util.Random;
public class J11resto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random ();
		
		System.out.println("digite uma nota");
		
		for (int i = 1000;i<=1999 ; i++) {
			int n = aleatorio.nextInt(1000) +999;
			if (n%11==5) {
				System.out.println(n);
				
			}
		}
	
	}

}

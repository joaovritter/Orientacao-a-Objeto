package provapkg;

public class Principal {

	public static void main(String[] args) {
		EventoShow ps1 = new EventoShow("Joaozinho da Revoada", "pista");
		EventoShow ps2 = new EventoShow ("Ricardo Camarote", "vip");
		EventoConfraria pc1 = new EventoConfraria("Marcelo Discreto", "pista");
		EventoConfraria pc2 = new EventoConfraria ("Wendel Passinho", "vip");
		ps1.adicionar("","","");
		ps2.adicionar("","", "");
		pc1.adicionar("","","");
		pc2.adicionar("","","");
		System.out.println("Removendo uns q n podem ir ");
		ps2.cancelar();
		pc1.cancelar();
		
		
		
	}

}

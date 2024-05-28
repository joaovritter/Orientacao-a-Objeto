package provapkg;

public class EventoConfraria extends Evento{

	public EventoConfraria(String nome, String ingresso) {
		super(nome, ingresso);		
	}
		
	public void adicionar (String nome, String ingresso, String resultado) {
		System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi adicionado no show");
	}
	
	public void cancelar () {
		if (ingresso == "vip") {
			System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi cancelado da confraria, esta elegivel a reebolso total");
		}
		if (ingresso == "pista") {
			System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi cancelado da confraria, esta elegivel a reembolso de 50%");
		}
	}

}

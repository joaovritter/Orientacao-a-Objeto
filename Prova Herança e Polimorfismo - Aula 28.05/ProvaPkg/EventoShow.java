package provapkg;

public class EventoShow extends Evento{

	public EventoShow(String nome, String ingresso) {
		super(nome, ingresso);
	}

	public void adicionar (String nome, String ingresso, String resultado) {
		System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi adicionado no show");
		
	}

	public void cancelar () {
		if (ingresso == "vip") {
			System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi cancelado do show, esta elegivel a reebolso total");
		}
		if (ingresso == "pista") {
			System.out.println(getNome()+" com ingresso do tipo "+getIngresso()+ ", foi cancelado do show, esta elegivel a reembolso de 50%");
		}
	}

}

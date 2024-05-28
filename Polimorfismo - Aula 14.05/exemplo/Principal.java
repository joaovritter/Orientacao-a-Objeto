package exemplo;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.fazerSom();
		
		a = new Cachorro();
		a.fazerSom();
		
		Cachorro c = new Cachorro();
		c.fazerSom();
		
		a = new Passarinho();
		a.fazerSom();
		
		a = new Hipopotamo();
		a.fazerSom();
		
		a = new Peixe();
		a.fazerSom();
	}

}

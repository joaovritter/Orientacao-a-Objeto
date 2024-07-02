package exercicio5;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, double salario) {
		super(nome, salario);	
	}
	

	@Override
	public void calcularSalario() {
		
		System.out.println("Salario do vendedor: R$"+salario);
		
	}

}

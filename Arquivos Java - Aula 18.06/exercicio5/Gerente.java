package exercicio5;

public class Gerente extends Funcionario {
	private double bonus;
	public Gerente(String nome, double salario) {
		super(nome, salario);
		this.bonus = bonus;
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void calcularSalario() {
		setBonus (0.2);
		salario = salario + (salario*bonus);
		
	}

}

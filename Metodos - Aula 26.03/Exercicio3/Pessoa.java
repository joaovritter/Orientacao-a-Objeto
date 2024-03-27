package Exercicio3;

public class Pessoa {
	String nome;
	String email;
	String dataNascimento;
	String endereco; 
	Boolean admin;

	public void atribuir (String nomeP, String nascimento, String enderecoP) {
		nome = nomeP;
		dataNascimento = nascimento;
		endereco = enderecoP;
	}
	public Boolean promoverAdmin () {
		return admin=true;
	}
	public String email (String emailP) {
		return email = emailP;
	}
}

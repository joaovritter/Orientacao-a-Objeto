package ProvinhaShowDeBola;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		try {
			System.out.println("Digite qual construtor deseja usar, 1 ou 2");
			int opcao = teclado.nextInt();
			int op;
			if (opcao==1) {
			Carro c1 = new Carro ("");
				do {
					System.out.println("Digite uma opcao de acordo com o menu: ");
					System.out.println("1- Exibir informacoes do carro");
					System.out.println("2- Atribuir marca do carro");
					System.out.println("3- Obter marca do carro");
					System.out.println("4- Sair");
					op = teclado.nextInt();
					switch (op) {
					case 1:
						c1.mostrarMarca(c1.marca);
						break;
						
					case 2:
						c1.atribuirMarca(c1.marca);
						c1.marca = teclado.next();
						break;
						
					case 3:
						System.out.println("Obtendo Marca do Carro:");
						c1.setMarca(c1.marca);
						break;
						
					case 4:
						System.out.println("Encerrando programa...");		
						break;
						
					default: 
						System.out.println("Tecla invalida, Digite novamente!");
					}
					
				}while (true);
			}
			
			
			if (opcao==2) {
				Carro c2 = new Carro ("");
					do {
						System.out.println("Digite uma opcao de acordo com o menu: ");
						System.out.println("1- Exibir informacoes do carro");
						System.out.println("2- Atribuir marca e modelo do carro");
						System.out.println("3- Obter marca e modelo do carro");
						System.out.println("4- Sair");
						op = teclado.nextInt();
						switch (op) {
						case 1:
							c2.mostrarMarcaModelo(c2.marca, c2.modelo);
							break;
							
						case 2:
							c2.atribuirMarcaModelo(c2.marca, c2.modelo);
							c2.marca = teclado.next();
							c2.modelo = teclado.next();
							break;
							
						case 3:
							System.out.println("Obtendo Marca e Modelo do Carro:");
							c2.setMarca(c2.marca);
							c2.setModelo(c2.modelo);
							break;
							
						case 4:
							System.out.println("Encerrando programa...");		
							break;
							
						default: 
							System.out.println("Tecla invalida, Digite novamente!");
						}	
					}while (true);
				}
		}catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}
}

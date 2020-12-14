package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao gerenciador de funcionários");
		
		String opcoes = "1 - Criar um funcionário\n"
				+ "2 - Alterar um funcionário\n"
				+ "3 - Remover um funcionário\n"
				+ "4 - Listar funcionários\n"
				+ "Digite outra tecla para sair!";
		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		do {
			
			System.out.println(opcoes);
			System.out.println("Digite a opção: ");
			
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					break;
					
				case 2: 
					break;
					
				case 3:
					break;
					
				case 4:
					break;
			}
			
		}while(opcao >= 1 && opcao <= 4);

	}

}

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
			System.out.print("Digite a opção: ");
			
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o primeiro nome: ");
					String primeiroNome = entrada.next();
					
					System.out.print("Digite o último nome: ");
					String ultimoNome = entrada.next();
					
					System.out.print("Digite o número de dependentes: ");
					int dependentes = entrada.nextInt();
					
					System.out.print("Digite a idade: ");
					int idade = entrada.nextInt();
					
					System.out.print("Digite função: ");
					String funcao = entrada.next();
					
					System.out.print("Digite o salário: ");
					double salario = entrada.nextDouble();
					
					Funcionario funcionario = new Funcionario(primeiroNome, ultimoNome, dependentes, idade, funcao, salario);
					
					funcionarios.add(funcionario);
					break;
					
				case 2:
					break;
					
				case 3:
					System.out.print("Digite o índice do funcionario a ser removido: ");
					int indice = entrada.nextInt();
					funcionarios.remove(indice);
					break;
					
				case 4:
					if(funcionarios.isEmpty()) {
						System.out.println("Não existem funcionários cadastrados!");
					}
					for(Funcionario f : funcionarios) {
						System.out.println();
						System.out.println(f.funcionarioToString());
					}
					break;
			}
			
		}while(opcao >= 1 && opcao <= 4);

	}

}

package ufc.poo;

public class Principal2 {
	
	public static void main(String[] args) {
		System.out.println("Olá, mundo!");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Flávio Barros");
		funcionario.setDependentes(5);
		funcionario.nome = "Zé";
		
		System.out.println(funcionario.imprimirFuncionario());
	}

}

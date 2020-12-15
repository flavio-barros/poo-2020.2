package principal;

public class TestaVariavelEstatica {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		//System.out.println(Funcionario.getContador());
		
		f1.incrementarContador();
		f2.incrementarContador();
		f1.incrementarContador();
		
		//System.out.println(Funcionario.getContador());
		
		System.out.println(f1.getId());
		System.out.println(f2.getId());
		System.out.println(f3.getId());
	}

}

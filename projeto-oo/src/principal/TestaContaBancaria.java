package principal;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		System.out.println("Taxa de manutenção das contas: "+ContaBancaria.getTaxaDeManutencao());
		
		ContaBancaria conta1 = new ContaBancaria(100, "Fulano 1", 123);
		conta1.sacar(50);
		conta1.sacar(35);
		conta1.sacar(20.7);
		
		System.out.println("Saldo da conta1: "+conta1.getSaldo());
		System.out.println("Nome do titular da conta1: "+conta1.getNomeTitular());
		System.out.println("Número da conta1: "+conta1.getNumero());
		
	}

}

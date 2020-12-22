package principal;

import contas.ContaBancaria;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.ContaSalario;

public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(150, "123", "Fulano", 0.01);
		ContaSalario contaSalario = new ContaSalario(200, "147", "Fulano 2", "Empresa A");
		
		System.out.println(contaCorrente);
	}

}

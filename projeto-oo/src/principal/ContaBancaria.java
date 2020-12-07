package principal;

public class ContaBancaria {
	
	private double saldo;
	private String nomeTitular;
	private int numero;
	
	// Métodos construtores
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nomeTitular, int numero) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
	}
	
	public ContaBancaria(double saldo, String nomeTitular, int numero) {
		depositar(saldo);
		this.nomeTitular = nomeTitular;
		this.numero = numero;
	}
	
	// Métods gets e sets
	public double getSaldo() {
		return this.saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return valor;
		}else {
			System.out.println("Saldo insuficiente!");
			return 0;
		}
	}
	
	public double sacar(double valor, double taxa) {
		double valorCobrado = valor * taxa;
		return sacar(valor + valorCobrado);
	}
	
	public double depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return valor;
		}else {
			System.out.println("Só é permitido depositar valores maiores que 0!");
			return 0;
		}
	}
	
	public static double getTaxaDeManutencao() {
		return 10.5;
	}
	
}

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
		if(saldo > 0) {
			this.saldo = saldo;
		}
		this.nomeTitular = nomeTitular;
		this.numero = numero;
	}
	
	// Métods gets e sets
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
}

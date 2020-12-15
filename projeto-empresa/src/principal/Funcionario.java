package principal;

import java.util.ArrayList;

public class Funcionario {
	
	private final int id;
	private String primeiroNome;
	private String ultimoNome;
	private ArrayList<Dependente> dependentes;
	private int idade;
	private String funcao;
	private double salario;
	
	private static int contador = 0;
	
	public Funcionario() {
		this.id = ++Funcionario.contador;
	}
	
	public Funcionario(String primeiroNome, String ultimoNome, int dependentes, int idade, String funcao,
			double salario) {
		this.id = ++Funcionario.contador;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.setIdade(idade);
		this.funcao = funcao;
		this.setSalario(salario);
	}
	
	public void incrementarContador() {
		Funcionario.contador++;
	}
	
	public ArrayList<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(ArrayList<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 18) this.idade = idade;
		else {
			this.idade = 18;
			System.out.println("Atenção: Não foi possível atribuir o valor de 'idade'");
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= 1045) this.salario = salario;
		else {
			this.salario = 1045;
			System.out.println("Atenção: Não foi possível atribuir o valor de 'salario'");
		}
	}
	
	public String funcionarioToString() {
		String funcionario = "Nome completo: "+this.primeiroNome+" "+this.ultimoNome+"\n"+
				"Dependentes: "+this.dependentes+"\n"+
				"Idade: "+this.idade+"\n"+
				"Função: "+this.funcao+"\n"+
				"Salario: R$"+this.salario;
		return funcionario;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Funcionario.contador = contador;
	}

	public int getId() {
		return id;
	}
}

package principal;

public class Funcionario {
	
	private String primeiroNome;
	private String ultimoNome;
	private int dependentes;
	private int idade;
	private String funcao;
	private double salario;
	
	public Funcionario(String primeiroNome, String ultimoNome, int dependentes, int idade, String funcao,
			double salario) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.setDependentes(dependentes);
		this.setIdade(idade);
		this.funcao = funcao;
		this.setSalario(salario);
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
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		if(dependentes >= 0) this.dependentes = dependentes;
		else {
			this.dependentes = 0;
			System.out.println("Atenção: Não foi possível atribuir o valor de 'dependentes'");
		}
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
}

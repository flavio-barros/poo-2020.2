package ufc.poo;

import java.util.Date;

public class Funcionario {
	
	String nome;
	Date dataNascimento;
	Integer dependentes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getDependentes() {
		return dependentes;
	}
	public void setDependentes(Integer dependentes) {
		this.dependentes = dependentes;
	}
	
	public String imprimirFuncionario() {
		return "Nome: "+this.nome+", Dependentes: "+this.dependentes;
	}

}

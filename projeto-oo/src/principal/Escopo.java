package principal;

public class Escopo {
	
	private int valor;
	
	public static int valor2;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor, int valor2) {
		this.valor = valor;
		Escopo.valor2 = valor2;
	}
	

}

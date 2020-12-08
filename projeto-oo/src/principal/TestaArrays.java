package principal;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaArrays {
	
	public static void main(String[] args) {
		
		// Acessando argumentos do método main
		System.out.println("Quantidade de argumentos da função main: "+args.length);
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
		
		// Criando arrays com o new
		int[] arrayInteiros = new int[100];
		ContaBancaria[] arrayContas = new ContaBancaria[100];
		
		ContaBancaria contaBancaria = new ContaBancaria();
		ContaBancaria contaBancaria2 = new ContaBancaria();
		
		// Criando arrays com uma lista inicializadora
		int[] arrayInteiros2 = {11, 3, 47, 6};
		ContaBancaria[] arrayContas2 = {contaBancaria, contaBancaria2};
		
		/*
		for(int i:arrayInteiros2) {
			System.out.println(i);
			i = 2;
		}
		*/
		
		// System.out.println(contaBancaria.getSaldo());
		TestaArrays.testaReferencia(contaBancaria);
		// System.out.println(contaBancaria.getSaldo());
		
		// Chamada de método com lista de argumentos de tamanho variável
		TestaArrays.listaVariavelDeArgumentos(1, 2, 10, 50, -15, -88);
		
		Arrays.sort(arrayInteiros2);
		for(int i:arrayInteiros2) {
			//System.out.println(i);
		}
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Elemento 1");
		lista.add("Elemento X");
		lista.add("Teste");
		
		for(String s:lista) {
			System.out.println(s);
		}
	}
	
	public static void testaReferencia(ContaBancaria contaBancaria) {
		contaBancaria.depositar(200);
		contaBancaria = new ContaBancaria();
	}
	
	public static void listaVariavelDeArgumentos(int a, int b, int ... numeros) {
		// System.out.println("Quantidade de parâmetros: "+numeros.length);
		for (int i:numeros) {
			// System.out.println(i);
		}
	}

}

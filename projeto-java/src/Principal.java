import java.util.Scanner;

/*
 *	Primeiro programa em Java!
 * 	Programa que imprime "Olá, mundo!" 
 */
public class Principal {
	
	// Método main inicia a execução do programa
	public static void main(String[] args) {
		
		// Imprimie texto no Console
		System.out.println("Olá, mundo!");
		
		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, nota3, resultado;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		resultado = (nota1+nota2+nota3)/3;
		
		System.out.printf("Média: %.2f\n", resultado);
		
		String situacao;// = resultado>7? "Aprovado":"Reprovado";
		
		if(resultado>7) situacao = "Aprovado";
		else situacao = "Reprovado";
		
		System.out.println("Situação: "+situacao);
		
		for(int i=0; i<100; i++) {
			
		}
		
		while(resultado < 5) {
			
		}
		
		do {
			
		}while(resultado < 5);
	
	}

}


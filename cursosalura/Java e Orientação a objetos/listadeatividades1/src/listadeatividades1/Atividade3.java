package listadeatividades1;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) {
		
		//int nome;
		//double salario;
		
		Scanner texto = new Scanner(System.in);
		String nome;
		System.out.println("Qual é o nome do funcionário:" );
		nome = texto.nextLine();
		System.out.println("Nome do funcionário: " + nome);
		
		System.out.println("Qual é o valor do seu salário?");
		double salario = texto.nextDouble();
		System.out.println("Salário: " + salario );
		
		
		
		
		
		//System.out.println("Nome do Funcion�rio:");
		System.out.println("Salário: " );
		System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " em Junho" );
	}
}

package listadeatividades1;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) {
		
		//int nome;
		//double salario;
		
		Scanner texto = new Scanner(System.in);
		String nome;
		System.out.println("Qual � o nome do funcion�rio:" );
		nome = texto.nextLine();
		System.out.println("Nome do Funcion�rio: " + nome);
		
		System.out.println("Qual � o valor do seu sal�rio?");
		double salario = texto.nextDouble();
		System.out.println("Sal�rio: " + salario );
		
		
		
		
		
		//System.out.println("Nome do Funcion�rio:");
		System.out.println("Sal�rio: " );
		System.out.println("O funcion�rio " + nome + " tem um sal�rio de R$ " + salario + " em Junho" );
	}
}

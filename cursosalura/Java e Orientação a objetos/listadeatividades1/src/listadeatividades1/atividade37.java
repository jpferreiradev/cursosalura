package listadeatividades1;

import java.util.Scanner;

public class atividade37 {
	public static void main(String args[]) {

		
		
		Scanner salario = new Scanner(System.in);
		
		
		System.out.println("Informe o seu salário atual:");
		double salarioAtual = salario.nextDouble();
		System.out.println("O seu salário atual é de R$: " + salarioAtual);
		
		System.out.println("Informe quantos anos ele trabalha nessa empresa:");
		int anosDeEmpresa = salario.nextInt();
		System.out.println("Você trabalha nessa empresa a " + anosDeEmpresa + " anos");
		
	}
}

package listadeatividades1;

import java.util.Scanner;

public class atividade15 {
	public static void main(String args[]) {
		
		
		int quantidadeHorasTrabalhadaDia = 8;
		int valorHoraTrabalhada = 25;
		 	
		Scanner dia = new Scanner(System.in);

		int quantidadeDeDiasTrabalhadosNoMes;
		System.out.println("Informe quantos dias foram trabalhados: ");
		quantidadeDeDiasTrabalhadosNoMes = dia.nextInt();
		System.out.println("Foram trabalhados " + quantidadeDeDiasTrabalhadosNoMes + " dias dos m�s");
		
		double valorSalarioPorDiaTrabalhado = quantidadeHorasTrabalhadaDia *  valorHoraTrabalhada;
		double valorSalarioMes = quantidadeDeDiasTrabalhadosNoMes * valorSalarioPorDiaTrabalhado;
		
		
		System.out.println("O valor do seu sal�rio no m�s � de R$: " + valorSalarioMes + " reais");
		
		
		
		
		
	}
}

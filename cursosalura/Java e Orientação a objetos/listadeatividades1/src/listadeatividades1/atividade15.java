package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade15 {
	public static void main(String args[]) {
		
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");
		
		int quantidadeHorasTrabalhadaDia = 8;
		int valorHoraTrabalhada = 25;
		 	
		Scanner dia = new Scanner(System.in);

		int quantidadeDeDiasTrabalhadosNoMes;
		System.out.println("Informe quantos dias foram trabalhados: ");
		quantidadeDeDiasTrabalhadosNoMes = dia.nextInt();
		System.out.println("Foram trabalhados " + quantidadeDeDiasTrabalhadosNoMes + " dias dos mês");
		
		double valorSalarioPorDiaTrabalhado = quantidadeHorasTrabalhadaDia *  valorHoraTrabalhada;
		double valorSalarioMes = quantidadeDeDiasTrabalhadosNoMes * valorSalarioPorDiaTrabalhado;
		
		
		System.out.println("O valor do seu salário no mês é de R$: " + valorSalarioMes + " reais");
		System.out.printf("O valor do seu salário no mês é de " + df.format(valorSalarioMes) + " reais");
		
		
		
		
	}
}

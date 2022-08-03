package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade36 {
	public static void main(String args[]) {

		Scanner prd = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");

		System.out.println("Informe horas você fez no mês:");
		int quantidadeDeHoras = prd.nextInt();


		int quantidadeDePontos = 1;
		double valorEmReaisPorPonto = 0.05;

		double conversaoTotalPontos = quantidadeDeHoras * valorEmReaisPorPonto;
		//System.out.println(df.format(conversaoTotalPontos));

		System.out.println("Você fez " + quantidadeDeHoras + " horas por mês e você faturou " + (df.format(conversaoTotalPontos) + " reais"));

		/*
		if(quantidadeDeHoras <= 10) {
			quantidadeDePontos = 2;
			valorEmReaisPorPonto = 0.10;
			double conversaoPontosEmReais = quantidadeDeHoras * valorEmReaisPorPonto;
			System.out.println(conversaoPontosEmReais);
			//conversaoTotalPontos = quantidadeDeHoras * conversaoTotalPontos;
			System.out.println(conversaoTotalPontos);
		 System.out.println("Funcionaou 2");

		}	else if(quantidadeDeHoras > 10 && quantidadeDeHoras < 20){
			quantidadeDePontos = 5;

			conversaoTotalPontos = quantidadeDeHoras * valorEmReaisPorPonto;

			System.out.println(conversaoTotalPontos);
			System.out.println("Funcionou 10 ");
		} if (quantidadeDeHoras > 20){
			quantidadeDePontos = 10;
			conversaoTotalPontos = quantidadeDeHoras * valorEmReaisPorPonto;
			System.out.println(conversaoTotalPontos);
			System.out.println("Funcionou 20 ");
		}

		}

		 */

	}


}



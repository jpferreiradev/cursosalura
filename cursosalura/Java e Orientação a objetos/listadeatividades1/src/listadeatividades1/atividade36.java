package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade36 {
	public static void main(String args[]) {

		Scanner mes = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");

		System.out.println("Informe a quantidade de horas de atividades fisícas no mês:");
		int quantidadeDeHorasMes = mes.nextInt();
		//System.out.println("A quantidade de horas feitas no mês foi de " + quantidadeDeHorasMes + " horas");

		
		double quantidadeDePontos = 2;
		
			double quantidadeDeDinheiro = 0.05;
		
		double conversaoPontosDeHoras = quantidadeDePontos * quantidadeDeDinheiro;
		
		double conversaoPontosEmReal = quantidadeDeHorasMes * conversaoPontosDeHoras;
		
		
		System.out.println(df.format(conversaoPontosDeHoras));
		System.out.println(df.format(conversaoPontosEmReal));
		
		//System.out.println("A quantidade de horas foi " + quantidadeDeHoras + " a quantidade de dinheiro foi" + quantidadeDeDinheiro + " e a quantidade de pontos foi de " + quantidadeDePontos );
		
		
		
		/*
		int quantidadeDePontosPorHora = 2;
		int quantidadeDePontosPorHoraEntre = 5;
		int quantidadeDePontosPorHoraAcima = 10;

		int conversaoHoraMes = quantidadeDeHorasMes * quantidadeDePontosPorHora;
		double conversaoMesReal = quantidadeDeDinheiro * conversaoHoraMes;

		int conversaoHoraMesEntre = quantidadeDeHorasMes * quantidadeDePontosPorHoraEntre;
		double conversaoMesRealEntre = quantidadeDeDinheiro * conversaoHoraMesEntre;

		int conversaoHoraMesAcima = quantidadeDeHorasMes * quantidadeDePontosPorHoraAcima;
		double conversaoMesRealAcima = quantidadeDeDinheiro * conversaoHoraMesAcima;

		
		
		if (quantidadeDeHorasMes < 10) {

			System.out.println("Você fez 10h de atividades no mês a sua pontuação foi de " + conversaoHoraMes
					+ " pontos e você recebeu " + df.format(conversaoMesRealAcima) + " reais");

		}
		if (quantidadeDeHorasMes >= 10 && quantidadeDeHorasMes <= 20) {

			System.out.println("Você fez de 10 até 20h de atividades no mês e a sua pontuação foi de "
					+ conversaoHoraMesEntre + " pontos e você recebeu " + df.format(conversaoMesRealEntre) + " reais");

		} else if (quantidadeDeHorasMes >= 20) {

			System.out.println("Você fez acima de 20h de atividades no mês e a sua pontuação foi de "
					+ conversaoHoraMesAcima + " pontos e você recebeu " + df.format(conversaoMesReal) + " reais");

		}
	*/
	}

}

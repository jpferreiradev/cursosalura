package listadeatividades1;

import java.util.Scanner;

public class atividade24 {
	public static void main(String args[]) {

		Scanner km = new Scanner(System.in);

		double quantidadeDeKmRodados;

		System.out.println("Qual a dist�ncia que voc� deseja percorrer?");
		quantidadeDeKmRodados = km.nextDouble();
		System.out.println("Voc� pecorreu " + quantidadeDeKmRodados + "km");

		double conversaoKmEmReal = quantidadeDeKmRodados * 0.50;
		double conversaoViagensMaisLongas = quantidadeDeKmRodados * 0.45;

		if (quantidadeDeKmRodados <= 200) {
			System.out.println(
					"Pela sua viagem ter sido de menos de 200km ser� cobrado R$ 0,50 por km andando, o valor � de R$"
							+ conversaoKmEmReal + "reais");
		} else {
			System.out.println(
					"Pela sua viagem ter sido de mais longa do que 200km ser� cobrado R$ 0,45 por km andando, o valor � de R$"
							+ conversaoViagensMaisLongas + "reais");
		}

	}
}

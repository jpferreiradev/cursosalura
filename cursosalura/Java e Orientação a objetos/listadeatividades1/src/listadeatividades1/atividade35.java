package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade35 {
	public static void main(String args[]) {

		int valorAluguelCarroPopular = 90;
		int valorAluguelCarroLuxo = 150;

		Scanner carro = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");

		System.out.println("Informe o tipo de carro que deseja entre popular ou luxo: ");
		String classeDeCarro = carro.nextLine();
		System.out.println("Informe a quantidade de dias que foram alugados:");
		int quantidadesDeDiasAlugados = carro.nextInt();
		System.out.println("Informe a quantidade de kilômetros que foram rodados:");
		double quantidadesDeKmRodados = carro.nextDouble();

		System.out.println("O tipo de carro foi:" + classeDeCarro);
		System.out.println("Foram " + quantidadesDeDiasAlugados + " dias");
		System.out.println("Foram " + quantidadesDeKmRodados + " km rodados");

		// carropopular
		double conversaoDeKmEmRealCarroPopular = quantidadesDeKmRodados * 0.20;
		double conversaoDeKmEmRealCarroPopularAcima = quantidadesDeKmRodados * 0.10;
		// carroluxo
		double conversaoKmEmRealCarroLuxo = quantidadesDeKmRodados * 0.30;
		double conversaoKmEmRealCarroLuxoAcima = quantidadesDeKmRodados * 0.25;

		int conversaoValorDiasEmRealCarroPopular = quantidadesDeDiasAlugados * valorAluguelCarroPopular;
		int conversaoValorDiasEmRealCarroLuxo = quantidadesDeDiasAlugados * valorAluguelCarroLuxo;

		double totalDeValorParaPagarCarroPopular = conversaoValorDiasEmRealCarroPopular
				+ conversaoDeKmEmRealCarroPopular;
		double totalDeValorParaPagarCarroPopularAcima = conversaoValorDiasEmRealCarroPopular
				+ conversaoDeKmEmRealCarroPopularAcima;

		double totalDeValorParaPagarCarroLuxo = conversaoValorDiasEmRealCarroLuxo + conversaoKmEmRealCarroLuxo;
		double totalDeValorParaPagarCarroLuxoAcime = conversaoValorDiasEmRealCarroLuxo
				+ conversaoKmEmRealCarroLuxoAcima;

		System.out.println("O tipo do carro escolhido foi: " + classeDeCarro + " e a quantidade de dias alugados foi de: " + quantidadesDeDiasAlugados + " dias  e foram rodados " + quantidadesDeKmRodados + "km ");

		if (quantidadesDeKmRodados < 100) {
			System.out.println("Até 100Km percorridos seram cobrados R$ 0,20 centavos por km e foram cobrados :" + df.format(conversaoDeKmEmRealCarroPopular));
		}
		if (quantidadesDeKmRodados > 100) {
			System.out.println("Acima de 100km percorridos seram cobrados R$ 0,10 centavos por km foram cobrados :" + df.format(conversaoDeKmEmRealCarroPopularAcima));
		}
		if (quantidadesDeKmRodados < 200) {
			System.out.println("Até 200km percorridos seram cobrados R$ 0,30 centavos por km e foram cobrados : " + df.format(conversaoKmEmRealCarroLuxo));
		} else if (quantidadesDeKmRodados > 200) {
			System.out.println("Acima de 200km percorridos seram cobrados R$ 0,25 centavos por km e foram cobrados :" + df.format(conversaoKmEmRealCarroLuxoAcima));
		}

	}

}

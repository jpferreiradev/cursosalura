package listadeatividades1;

import java.util.Scanner;

public class atividade28 {
	public static void main(String args[]) {

		Scanner tamanho = new Scanner(System.in);

		double tamanhoDaLargura;
		double tamanoDoComprimento;

		System.out.println("Informe o tamanho da base:");
		tamanhoDaLargura = tamanho.nextDouble();
		System.out.println("Informe o tamanho da altura:");
		tamanoDoComprimento = tamanho.nextDouble();

		System.out.println("O tamanho da sua largura é de " + tamanhoDaLargura + " e o tamanho do seu comprimento é "
				+ tamanoDoComprimento);

		double calculoAreaTerreno = tamanhoDaLargura * tamanoDoComprimento;

		System.out.println("O tamanho do terreno é de " + calculoAreaTerreno + " metros quadrados");

		if (calculoAreaTerreno < 100) {
			System.out.println("O seu terreno é POPULAR");
		}
		if (calculoAreaTerreno >= 100 && calculoAreaTerreno <= 500) {
			System.out.println("O seu terreno é MASTER");
		} else if (calculoAreaTerreno > 500) {
			System.out.println("Seu terreno é VIP");
		}

	}
}

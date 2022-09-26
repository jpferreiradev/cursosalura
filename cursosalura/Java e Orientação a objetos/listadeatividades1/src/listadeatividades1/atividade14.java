package listadeatividades1;

import java.util.Scanner;

public class atividade14 {
	public static void main(String args[]) {

		Scanner texto = new Scanner(System.in);

		double quantidadesDeKmRodados;
		System.out.println("Digite a quantidade de kilometros que foram rodados: ");
		quantidadesDeKmRodados = texto.nextDouble();
		System.out.println("A quantidade de kilometros foi de " + quantidadesDeKmRodados + "km");

		double conversaoDeKmEmReal = quantidadesDeKmRodados * 0.20;

		System.out.println(conversaoDeKmEmReal);

		System.out.println("Digite a quantidade de dias que foram rodados: ");
		int quantidadeDeDiasRodados = texto.nextInt();
		System.out.println("A quantidade de dias que foram rodados foi de " + quantidadeDeDiasRodados + " dias");

		int conversaoDoValorDeDiasEmReal = quantidadeDeDiasRodados * 90;
		System.out.println(conversaoDoValorDeDiasEmReal);

		double totalDeValorParaPagar = conversaoDeKmEmReal + conversaoDoValorDeDiasEmReal;
		
		System.out.println("O preço total para o pagamento é de:R$ " + totalDeValorParaPagar + " reais");
	}
}

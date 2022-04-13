package exercicios;

import java.util.Scanner;

public class AtividadeTres {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);
		double notaUm;
		System.out.println("Digite a primeira nota: ");
		notaUm = numero.nextDouble();
		System.out.println("Sua primeira nota foi: " + notaUm);

		Scanner numero2 = new Scanner(System.in);
		double notaDois;
		System.out.println("Digite a segunda nota: ");
		notaDois = numero2.nextDouble();
		System.out.println("A sua segunda nota foi: " + notaDois);

		double calculaMedia = (notaUm + notaDois) / 2;

		if (calculaMedia >= 6) {
			System.out.println("Você precisa ter uma nota maior ou igual a 6, parabéns você passou!");
		} else {
			System.out.println("Você não conseguiu passar.");
		}

		System.out.println(calculaMedia);

	}
}

package listadeatividades1;

import java.util.Scanner;

public class atividade21 {
	public static void main(String args[]) {

		Scanner ano = new Scanner(System.in);

		int anoDigitado;
		System.out.println("Digite o ano:");
		anoDigitado = ano.nextInt();

		System.out.println("O ano digitado foi: " + anoDigitado);

		int calculoAnoBissexto = anoDigitado;

		if ((calculoAnoBissexto % 4 == 0) && (calculoAnoBissexto % 100 != 0 || calculoAnoBissexto % 400 == 0)) {
			System.out.println("É ano bissexto");
		} else {
			System.out.println("Não é ano bissexto");
		}

	}
}

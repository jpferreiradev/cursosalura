package listadeatividades1;

import java.util.Scanner;

public class atividade20 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numeroDigitado;
		numeroDigitado = numero.nextInt();
		System.out.println("N�mero digitado foi: " + numeroDigitado);

		// resto 0
		int numeroPar = numeroDigitado % 2;

		// resto 1
		int numeroImpar = numeroDigitado % 2;

		if (numeroPar <= 0) {
			System.out.println("Esse n�mero � par.");
		} else {

			System.out.println("Esse n�mero � impar.");
		}

	}
}

//for (int x = 0; x < y; x++)
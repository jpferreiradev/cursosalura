package listadeatividades1;

import java.util.Scanner;

public class atividade20 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numeroDigitado;
		numeroDigitado = numero.nextInt();
		System.out.println("Número digitado foi: " + numeroDigitado);

		// resto 0
		int numeroPar = numeroDigitado % 2;

		// resto 1
		int numeroImpar = numeroDigitado % 2;

		if (numeroPar <= 0) {
			System.out.println("Esse número é par.");
		} else {

			System.out.println("Esse número é impar.");
		}

	}
}

//for (int x = 0; x < y; x++)
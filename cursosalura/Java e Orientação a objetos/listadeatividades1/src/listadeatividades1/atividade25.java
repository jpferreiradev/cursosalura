package listadeatividades1;

import java.util.Scanner;

public class atividade25 {
	public static void main(String args[]) {

		Scanner medida = new Scanner(System.in);

		int ladoA, ladoB, ladoC;

		System.out.println("Digite o tamanho do primeiro lado:");
		ladoA = medida.nextInt();
		// System.out.println(ladoA);

		System.out.println("Digite o tamanho do segundo lado:");
		ladoB = medida.nextInt();
		// System.out.println(ladoB);

		System.out.println("Digite o tamanho do terceiro lado:");
		ladoC = medida.nextInt();
		// System.out.println(ladoC);

		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Esse tri�ngulo � equilatero");
		}
		if (ladoA == ladoB && ladoA != ladoC) {
			System.out.println("Esse tri�ngulo � isosceles ");
		} else if (ladoA != ladoB && ladoA != ladoC) {
			System.out.println("Esse tri�ngulo � escaleno");
		} else {
			// System.out.println("N�o existe tri�ngulo");
		}

		 

	}
}

//System.out.println("O tamanho dos lados s�o " + ladoA + ladoB + ladoC);
// Fazer com algu�m, ou pedir ajuda;

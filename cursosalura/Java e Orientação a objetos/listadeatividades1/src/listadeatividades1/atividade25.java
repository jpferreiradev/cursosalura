package listadeatividades1;

import java.util.Scanner;

public class atividade25 {
	public static void main(String args[]) {

		Scanner medida = new Scanner(System.in);

		int ladoA, ladoB, ladoC;

		System.out.println("Digite o tamanho do primeiro lado:");
		ladoA = medida.nextInt();

		System.out.println("Digite o tamanho do segundo lado:");
		ladoB = medida.nextInt();

		System.out.println("Digite o tamanho do terceiro lado:");
		ladoC = medida.nextInt();

		if (ladoA == 0 && ladoB == 0 && ladoC == 0) {
			System.out.println("Não é possível criar um triângulo");
		} else {
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.println("Esse triângulo é equilátero");
			}
			if (ladoA == ladoB && ladoA != ladoC) {
				System.out.println("Esse triângulo é isosceles ");
			} else if (ladoA != ladoB && ladoA != ladoC) {
				System.out.println("Esse triângulo é escaleno");

			}

		}
	}

}

//System.out.println("O tamanho dos lados são " + ladoA + ladoB + ladoC);
// Fazer com alguém, ou pedir ajuda;

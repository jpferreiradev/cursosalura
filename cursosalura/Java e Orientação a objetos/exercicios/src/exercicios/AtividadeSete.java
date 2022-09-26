package exercicios;

//import java.util.Scanner;

public class AtividadeSete {
	public static void main(String args[]) {

		int numeroUm = 20;
		int numeroDois = 20;
		int produtoDosNumeros = numeroUm * numeroDois;

		if (numeroUm > numeroDois) {
			System.out.println("O número maior é " + numeroUm);
		} else if (numeroDois > numeroUm) {
			System.out.println("O número maior é " + numeroDois);

		}

		if (numeroUm == numeroDois) {
			System.out.println("Os números que você digitou são iguais, o produto deles é: " + produtoDosNumeros);
		}

	}

}

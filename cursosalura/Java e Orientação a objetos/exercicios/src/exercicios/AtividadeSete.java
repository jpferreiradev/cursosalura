package exercicios;

//import java.util.Scanner;

public class AtividadeSete {
	public static void main(String args[]) {

		int numeroUm = 20;
		int numeroDois = 20;
		int produtoDosNumeros = numeroUm * numeroDois;

		if (numeroUm > numeroDois) {
			System.out.println("O n�mero maior � " + numeroUm);
		} else if (numeroDois > numeroUm) {
			System.out.println("O n�mero maior � " + numeroDois);

		}

		if (numeroUm == numeroDois) {
			System.out.println("Os n�meros que voc� digitou s�o iguais, o produto deles �: " + produtoDosNumeros);
		}

	}

}

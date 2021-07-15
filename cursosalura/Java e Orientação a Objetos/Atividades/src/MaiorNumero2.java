
import java.util.Scanner;

public class MaiorNumero2 {
	public static void main(String[] args) {

		Scanner maior = new Scanner(System.in);

		int primeiroNumero, segundoNumero;

		System.out.printf("Informe o primeiro número: ");
		primeiroNumero = maior.nextInt();
		System.out.printf("Informe o segundo número: ");
		segundoNumero = maior.nextInt();

		System.out.println("O primeiro número é:" + primeiroNumero);
		System.out.println("O segundo número é: " + segundoNumero);

		if (primeiroNumero > segundoNumero) {
			System.out.println(" O número 1 maior que número 2");

		} else {
			System.out.println("O número 2 é menor que número 1");
		}

	}
}

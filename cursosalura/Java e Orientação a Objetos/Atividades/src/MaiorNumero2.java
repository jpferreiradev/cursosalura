
import java.util.Scanner;

public class MaiorNumero2 {
	public static void main(String[] args) {

		Scanner maior = new Scanner(System.in);

		int primeiroNumero, segundoNumero;

		System.out.printf("Informe o primeiro n�mero: ");
		primeiroNumero = maior.nextInt();
		System.out.printf("Informe o segundo n�mero: ");
		segundoNumero = maior.nextInt();

		System.out.println("O primeiro n�mero �:" + primeiroNumero);
		System.out.println("O segundo n�mero �: " + segundoNumero);

		if (primeiroNumero > segundoNumero) {
			System.out.println(" O n�mero 1 maior que n�mero 2");

		} else {
			System.out.println("O n�mero 2 � menor que n�mero 1");
		}

	}
}

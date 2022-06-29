
import java.lang.Math;

public class TestaCalculoAoQuadrado {

	public static void main(String args[]) {

		double a = 30;
		double b = 2;
		System.out.println(Math.pow(a, b));

		a = 3;
		b = 4;
		System.out.println(Math.pow(a, b));

		a = 2;
		b = 6;
		System.out.println(Math.pow(a, b));

		/*
		 * int i = 2; int square = Math.pow((i, 2);
		 */

		int i = 2;
		int square = i * i;
		System.out.println(square);

		// int square = Math.pow(i, 2);

	}
}

/*
 * public static double pow(double a, double b) Parameter: a : this parameter is
 * the base b : this parameter is the exponent. Return : This method returns aB.
 */
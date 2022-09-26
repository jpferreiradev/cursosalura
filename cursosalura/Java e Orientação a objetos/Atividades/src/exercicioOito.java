import java.util.Scanner;

public class exercicioOito {
	public static void main(String args[]) {

		int valorSalarioMinimo = 788;

		System.out.println("O valor do salário minímo é de : " + valorSalarioMinimo);

		Scanner ler = new Scanner(System.in);

		double valorSalarioUsuario;
		System.out.println("Informe o seu salário: ");
		valorSalarioUsuario = ler.nextDouble();
		System.out.println("O seu salário é de: R$ " + valorSalarioUsuario);

		double quantidadeDeSalariosMinimos = valorSalarioUsuario / valorSalarioMinimo;
		
		System.out.println("A quantidade de salários minimos é de : " + (int)quantidadeDeSalariosMinimos);

	}
}

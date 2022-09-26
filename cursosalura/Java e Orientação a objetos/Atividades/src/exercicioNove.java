import java.util.Scanner;

public class exercicioNove {

	public static void main(String args[]) {

		int numeroAntecessor = -1;
		int numeroSucessor = +1;

		Scanner numero = new Scanner(System.in);

		int numeroInteiro;
		System.out.println("Digite um número inteiro: ");
		numeroInteiro = numero.nextInt();
		System.out.println("O número digitado foi: " + numeroInteiro);

		System.out.println("Seu número antecessor é: " + (numeroInteiro + numeroAntecessor));
		System.out.println("Seu número sucessor é: " + (numeroInteiro + numeroSucessor));

	}
}

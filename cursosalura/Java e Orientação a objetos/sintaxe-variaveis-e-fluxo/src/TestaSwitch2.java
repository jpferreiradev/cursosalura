
import java.util.Scanner;

public class TestaSwitch2 {
	public static void main(String args[]) {

		Scanner mes = new Scanner(System.in);

		System.out.println("Digite o m�s desejado:");
		int valorMes = mes.nextInt();

		switch (valorMes) {

		case 1:
			System.out.println("O m�s � Janeiro");
			break;
		case 2:
			System.out.println("O m�s � fevereiro");
			break;
		case 3:
			System.out.println("O m�s � mar�o");
			break;
		case 4:
			System.out.println(" O m�s � abril ");
			break;
		case 5:
			System.out.println("O m�s � maio");
			break;
		case 6:
			System.out.println("O m�s � junho");
			break;
		case 7:
			System.out.println("O m�s � julho");
			break;
		case 8:
			System.out.println("O m�s � agosto");
			break;
		case 9:
			System.out.println("O m�s � o setembro");
			break;
		case 10:
			System.out.println("O m�s � outubro");
			break;
		case 11:
			System.out.println("O m�s � novembro");
			break;
		case 12:
			System.out.println("O m�s � dezembro");
			break;
		default:
			System.out.println("M�s inv�lido");
			break;

		}
	}
}

import java.util.Scanner;

public class exercicioQuatro {
	public static void main(String[] args) {

		// mes = 365
		// mes = 30
		// dia = 24hrs

		//int minhaIdade;
		int ano = 365;
		int mes = 30;
		int dias;
		//int somaIdadeContataEmDias = ano + mes;

		Scanner scan = new Scanner(System.in);

		int minhaIdade;
		System.out.println(" Digite a sua idade:");
		minhaIdade = scan.nextInt();
		System.out.println(minhaIdade);

		
		
		int somaIdadeContataEmDias  =  (minhaIdade * ano) + (minhaIdade * mes);

		System.out.println("Você tem essa quantidade de dias de vida: " + somaIdadeContataEmDias + " dias");
		

		// System.out.println(idadeContadaEmDias);

		// System.out.println("A sua idade � em dias � de:");

	}
}

// É preciso ser mostrado nesse exemplo: 30 anos, 2 meses  x dias
package listadeatividades1;

import java.util.Scanner;

public class atividade26 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		int numeroUm;
		System.out.println("Digite o primeiro n�mero:");
		numeroUm = numero.nextInt();
		int numeroDois;
		System.out.println("Digite o segundo n�mero: ");
		numeroDois = numero.nextInt();

	
		if(numeroUm > numeroDois) {
			System.out.println("O primeiro valor � maior");
		} if (numeroDois > numeroUm) {
			System.out.println("O segundo valor � maior");
		} else {
			System.out.println("N�o existe valor maior, os dois s�o iguais");
		}
	
	}

}

//O primeiro valor � o maior
//O segundo valor � o maior
//N�o existe valor maior, os dois s�o iguais

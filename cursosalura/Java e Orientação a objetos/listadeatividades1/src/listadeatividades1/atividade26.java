package listadeatividades1;

import java.util.Scanner;

public class atividade26 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		int numeroUm;
		System.out.println("Digite o primeiro número:");
		numeroUm = numero.nextInt();
		int numeroDois;
		System.out.println("Digite o segundo número: ");
		numeroDois = numero.nextInt();

	
		if(numeroUm > numeroDois) {
			System.out.println("O primeiro valor é maior");
		} if (numeroDois > numeroUm) {
			System.out.println("O segundo valor é maior");
		} else {
			System.out.println("Não existe valor maior, os dois são iguais");
		}
	
	}

}

//O primeiro valor é o maior
//O segundo valor é o maior
//Não existe valor maior, os dois são iguais

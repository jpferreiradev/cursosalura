package listadeatividades1;

import java.util.Scanner;

public class atividade18 {
	public static void main(String args[]) {

		int anoDeNascimento;
		int valorDaIdade;
		int anoAtual;

		Scanner idade = new Scanner(System.in);
		System.out.println("Informe o ano de nascimento: ");
		anoDeNascimento = idade.nextInt();
		System.out.println("O ano que voc� nasceu foi " + anoDeNascimento + " anos");

		System.out.println("Informe o ano atual:");
		anoAtual = idade.nextInt();

		int idadeParaVotar = anoAtual - anoDeNascimento;

		System.out.println("Sua idade hoje � de " + idadeParaVotar + " anos");

		if (idadeParaVotar >= 18) {
			System.out.println("A sua idade permite voc� votar.");
		} else {
			System.out.println("� preciso ser maior que 18 anos para conseguir votar.");
		}

	}
}

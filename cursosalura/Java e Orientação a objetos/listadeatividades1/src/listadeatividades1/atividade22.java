package listadeatividades1;

import java.util.Scanner;

public class atividade22 {
	public static void main(String args[]) {

		Scanner idade = new Scanner(System.in);

		System.out.println("Digite o ano atual:");
		int anoAtual;
		anoAtual = idade.nextInt();

		int anoDeNascimento;
		System.out.println("Digite o ano que você nasceu:");
		anoDeNascimento = idade.nextInt();
		// System.out.println(anoDeNascimento);

		int valorDaIdade = anoAtual - anoDeNascimento;

		int idadeDoAlistamento = 18;
		int anosQueFaltamAlistamento = valorDaIdade - idadeDoAlistamento;
		int anosQuePassaramAlistamento = valorDaIdade - idadeDoAlistamento;

		System.out.println("Você tem " + valorDaIdade + " anos");

		if (valorDaIdade <= idadeDoAlistamento) {
			System.out.println("Faltam " + anosQueFaltamAlistamento + " anos para você se alistar.");
		} if (valorDaIdade == idadeDoAlistamento) {
			System.out.println("Você tem já pode se alistar.");
		} else {
			System.out.println("Já se passaram " + anosQuePassaramAlistamento + " anos para você se alistar");
		}

		// System.out.println("Você tem " + valorDaIdade + " anos");
	}
}

//System.out.println(anosQueFaltamAlistamento);
//System.out.println("Anos que passaram do alistamento " + anosQuePassaramAlistamento);

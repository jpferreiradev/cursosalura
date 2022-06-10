package listadeatividades1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade27 {
	public static void main(String args[]) {

		Scanner nota = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");

		double notaAlunoUm;
		double notaAlunoDois;

		System.out.println("Digite a primeira nota:");
		notaAlunoUm = nota.nextDouble();
		System.out.println("Valor da primeira nota é: " + notaAlunoUm);

		System.out.println("Digite a segunda nota:");
		notaAlunoDois = nota.nextDouble();
		System.out.println("Valor da segunda nota é: " + notaAlunoDois);

		double calculoMedia = (notaAlunoUm + notaAlunoDois) / 2;

		System.out.println("O valor da sua média foi: " + df.format(calculoMedia));

		if (calculoMedia <= 4.9) {
			System.out.println("Você está reprovado");
		}
		if (calculoMedia == 5 || calculoMedia == 6.9) {
			System.out.println("Você está em recuperação");
		} else if (calculoMedia > 7) {
			System.out.println("Você está aprovado");
			{

			}
		}
	}

}

//Média até 4.9: REPROVADO//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO
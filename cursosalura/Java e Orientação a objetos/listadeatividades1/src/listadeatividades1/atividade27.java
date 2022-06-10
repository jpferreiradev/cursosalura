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
		System.out.println("Valor da primeira nota �: " + notaAlunoUm);

		System.out.println("Digite a segunda nota:");
		notaAlunoDois = nota.nextDouble();
		System.out.println("Valor da segunda nota �: " + notaAlunoDois);

		double calculoMedia = (notaAlunoUm + notaAlunoDois) / 2;

		System.out.println("O valor da sua m�dia foi: " + df.format(calculoMedia));

		if (calculoMedia <= 4.9) {
			System.out.println("Voc� est� reprovado");
		}
		if (calculoMedia == 5 || calculoMedia == 6.9) {
			System.out.println("Voc� est� em recupera��o");
		} else if (calculoMedia > 7) {
			System.out.println("Voc� est� aprovado");
			{

			}
		}
	}

}

//M�dia at� 4.9: REPROVADO//- M�dia entre 5.0 e 6.9: RECUPERA��O
//- M�dia 7.0 ou superior: APROVADO
package exercicios;

public class AtividadeOito {
	public static void main(String args[]) {

		double notaUm = 2;
		double notaDois = 2;
		double mediaDasNotas = (notaUm + notaDois) / 2;

		if (mediaDasNotas >= 6) {
			System.out.println("Voc� est� aprovado, parab�ns!!");
		} else if (mediaDasNotas  > 4 && mediaDasNotas < 6) {
			System.out.println("Voc� est� de prova final!");
		} else if (mediaDasNotas <= 4) {
			System.out.println("Voc� est� reprovado!!");
		}

	}

}

/*
 * 
 * Menor que 4,0 - Mensagem Reprovado - 4 Entre 4 (incluse) e 6,0 ( Prova final
 * Acima de 6 - Aprovado
 * 
 */
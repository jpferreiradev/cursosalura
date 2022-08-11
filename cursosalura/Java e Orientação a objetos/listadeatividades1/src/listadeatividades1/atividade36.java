
package listadeatividades1;


import java.text.DecimalFormat;
import java.util.Scanner;
public class atividade36 {
	public static void main(String args[]) {

		Scanner vsdp = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");

		double valorDoPontoEmReais = 0.05;

		System.out.println("Informe quantas horas foram feitas de atividade:");
		int quantidadeDeHoras = vsdp.nextInt();
		System.out.println("A quantidade de horas foi de " + quantidadeDeHoras + " horas");
		double valorHoraPontoEmReais = quantidadeDeHoras  * valorDoPontoEmReais;
		System.out.println("A quantidade de pontos ganhos foi de " + quantidadeDeHoras + "e a quantidade de dinheiro foi de " + df.format(valorHoraPontoEmReais));




	}
}



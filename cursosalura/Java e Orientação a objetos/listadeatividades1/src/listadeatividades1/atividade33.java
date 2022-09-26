package listadeatividades1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class atividade33 {
	public static void main(String args[]) {

		Scanner csa = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
		//df.applyPattern("R$ #,##0.00");
		df.applyPattern("#,##0.00");
		
		System.out.println("Digite o valor da casa: ");
		int valorCasa = csa.nextInt();
		System.out.println("Informe a taxa de juros:");
		double valorDosJuros = csa.nextDouble();
		System.out.println("Digite o valor do seu sal�rio:");
		double valorSalario = csa.nextDouble();
		System.out.println("Digite em quantos anos voc� quer pagar a casa:");
		int valorAnosPagosCasa = csa.nextInt();

		double calculoPorcetagemSalario = (30 * valorSalario) / 100;
		System.out.println(calculoPorcetagemSalario);
		System.out.println("O valor da porcetagem do seu sal�rio � de " + df.format(calculoPorcetagemSalario));

		double conversaoJuros = valorDosJuros / 100;
		double calculoJurosMensal = conversaoJuros / 12;
		double calculoPrestacaoMensal = calculoJurosMensal * valorCasa;
		System.out.println(df.format(calculoPrestacaoMensal));
		
		if(calculoPorcetagemSalario >= calculoPrestacaoMensal) {
			System.out.println("Emprestimo permitiado, o seu sal�rio n�o excedeu os 30%");
		} else {
			System.out.println("Infelizmente seu empr�stimo ser� negado");
		}
		

		// System.out.println("O valor da casa � R$ " + valorCasa + "reais" + ", o valor
		// do seu sal�rio � de R$ " + valorSalario + " reais" );

	}
}

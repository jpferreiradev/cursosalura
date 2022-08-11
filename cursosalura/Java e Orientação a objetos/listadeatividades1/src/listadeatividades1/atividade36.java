
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
		double valorHoraPontoEmReais = quantidadeDeHoras * valorDoPontoEmReais;
		System.out.println("A quantidade de pontos ganhos foi de " + quantidadeDeHoras + " e a quantidade de dinheiro foi de " + df.format(valorHoraPontoEmReais));


		if (quantidadeDeHoras < 10) {
			valorDoPontoEmReais = 0.10;
			valorHoraPontoEmReais = quantidadeDeHoras * valorDoPontoEmReais;
			System.out.println("Como você fez até 10h de atividade você ganhou " + df.format(valorHoraPontoEmReais) + " reais");
		}
		if(quantidadeDeHoras > 10 && quantidadeDeHoras < 20) {
			valorDoPontoEmReais = 0.25;
			valorHoraPontoEmReais = quantidadeDeHoras * valorDoPontoEmReais;
			System.out.println("Como você fez mais de 10 até 20h de atividade você ganhou" + df.format(valorHoraPontoEmReais) + " reais");

		} else if (quantidadeDeHoras > 20){
				valorDoPontoEmReais = 0.50;
				valorHoraPontoEmReais = quantidadeDeHoras * valorDoPontoEmReais;
				System.out.println("Como você fez mais de 20h de atividade você ganhou " + df.format(valorHoraPontoEmReais) + " reais");
			}

			}

		}










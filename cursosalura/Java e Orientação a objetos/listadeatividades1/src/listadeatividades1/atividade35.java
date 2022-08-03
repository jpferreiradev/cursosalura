package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade35 {
	public static void main(String args[]) {

		Scanner dkt = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");


		System.out.println("Informe o tipo de carro:");
		String qualModeloCarro = dkt.nextLine();
		System.out.println("O tipo de carro foi" + qualModeloCarro);
		System.out.println("Informe a quantidade de dias alugados:");
		int quantidadeDias = dkt.nextInt();
		System.out.println("Informe a quantidade de kilômetros peccoridos:");
		double quantidadeKmPecorridos = dkt.nextDouble();
		System.out.println("A quantidade de kilômetros pecorridos foi " +  quantidadeKmPecorridos + " km");

		int conversaoDiasAlugadosEmReais;
		double conversaoKmRodadsoEmReais;
		double valorTotal;
		double fatorPorKm;
		double totalAPagar;
		String tipoCarro = "carroPopular";
		String tipoCarroDois = "carroLuxo";


		if(qualModeloCarro.equals(tipoCarro)) {
			if (quantidadeKmPecorridos <= 100) {
				fatorPorKm = 0.20;
				conversaoKmRodadsoEmReais = quantidadeKmPecorridos * fatorPorKm;
				conversaoDiasAlugadosEmReais = quantidadeDias * 90;
				System.out.println(df.format(conversaoKmRodadsoEmReais));

			} else {
				fatorPorKm = 0.10;
				conversaoKmRodadsoEmReais = quantidadeKmPecorridos * fatorPorKm;
				conversaoDiasAlugadosEmReais = quantidadeDias * 90;
				System.out.println(df.format(conversaoKmRodadsoEmReais));
			}
		}
		if(qualModeloCarro.equals(tipoCarroDois)) {
			if (quantidadeKmPecorridos >= 200) {
				fatorPorKm = 0.30;
				conversaoKmRodadsoEmReais = quantidadeKmPecorridos * fatorPorKm;
				conversaoDiasAlugadosEmReais = quantidadeDias * 150;
				System.out.println(df.format(conversaoKmRodadsoEmReais));

			} else {
				fatorPorKm = 0.25;
				conversaoKmRodadsoEmReais = quantidadeKmPecorridos * fatorPorKm;
				conversaoDiasAlugadosEmReais = quantidadeDias * 150;
				System.out.println(df.format(conversaoKmRodadsoEmReais));
			}
		}


	}

}



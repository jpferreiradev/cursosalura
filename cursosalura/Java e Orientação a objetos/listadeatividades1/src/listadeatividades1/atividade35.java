package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade35 {
	public static void main(String args[]) {

		
		Scanner dia  = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");
		
		System.out.println("Informe o tipo de carro ");
		String tipoCarro = dia.nextLine();
		System.out.println("O tipo de carro foi:" + tipoCarro);
		System.out.println("Informe a quantidade de dias que foram alugados e km rodados");
		int diasAlugados = dia.nextInt();
		double quantidadeKmRodados = dia.nextDouble();
		System.out.println("Foram " + diasAlugados + " dias alugados e rodados " +  quantidadeKmRodados + " quilômetros rodados");
		
		int valorAluguelCarroPopularDia = 90;
		int valorAluguelCarroLuxoDia = 150;
		
		double conversaoKmEmReais = quantidadeKmRodados * 0.20;
		System.out.println(df.format(conversaoKmEmReais));
	
	
	}

}

/* - Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km

- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km
*/
package listadeatividades1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class atividade35par2 {
	public static void main(String[] args) {

		Scanner dfc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");

		int precoCarroPopularDia = 90;
		int precoCarroLuxoDia = 150;
		
		System.out.println("Informe o tipo de carro:");
		String tipoDeCarro = dfc.nextLine();
		System.out.println("Informe a quantidade de dias alugados:");
		int quantidadeDiasAlugados = dfc.nextInt();
		System.out.println("Informe a quantidade de km rodados:");
		double quantidadeKmRodados = dfc.nextDouble();
		
		System.out.println("O tipo de carro escolhido foi " + tipoDeCarro + ", foram " + quantidadeDiasAlugados + " dias alugados e " 	+ quantidadeKmRodados + "km rodados");
		
		double totalAPagar = quantidadeDiasAlugados * quantidadeKmRodados;
		
		System.out.println(totalAPagar);
		
		if(quantidadeKmRodados < 100 ) {
			System.out.println("Até 100km pecorridos você irá pagar ");
			
			
		}
		
		
		
		
		//double conversaoDiasEmReaisCarroPopular = precoCarroPopularDia * quantidadeDiasAlugados ;
		//double conversaoDiasEmReaisCarroLuxo = precoCarroLuxoDia * quantidadeDiasAlugados;
		
	
		
	}
}

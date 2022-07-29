package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade35 {
	public static void main(String args[]) {

		Scanner cak = new Scanner(System.in);

		System.out.println("Informe qual a versão do carro: ");
		String modeloCarro = cak.nextLine();
		System.out.println("O carro escolhido foi " + modeloCarro);
		System.out.println("Informe a quantidade de dias alugados");
		int diasAlugados = cak.nextInt();
		System.out.println("A quantidade de dias alugados foi " + diasAlugados + " dias");
		System.out.println("Informe a quantidade de kilometros que foram rodados:");
		double quantidadeKmRodados = cak.nextDouble();
		System.out.println("A quantidade de kilometros rodados foi " + quantidadeKmRodados + "Km");
	
		double fatorPorKm = 0;
		
		String carroPopular;
		String  carroLuxo;
		
		
		int valorDiaCarroPopular = 90;
		int valorDiaCarroLuxo = 150;
		
		double conversaoKmEmReais = quantidadeKmRodados * fatorPorKm;
		double conversaoDiaCarroEmReais = diasAlugados;
		
		
		//carroPopular
		if(quantidadeKmRodados <= 100) {
			fatorPorKm = 0.20;
			System.out.println(fatorPorKm);
		} if(quantidadeKmRodados > 100) {
			fatorPorKm = 0.10;
			System.out.println(fatorPorKm);
		}
			
		//carroLuxo
		if(quantidadeKmRodados <= 200 ) {
			fatorPorKm = 0.30;
		} if( quantidadeKmRodados > 200) {
			fatorPorKm = 0.25;
		}
		
		
	
	}

}
// Saber o valor de quanto é quando você me informa os km rodados e os dias...

/*
 * Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
 * para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um
 * programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de
 * aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de
 * acordo com a tabela a seguir:
 * 
 *  - Carros populares (aluguel de R$90 por dia) -
 * Até 100Km percorridos: R$0,20 por Km - 
 * Acima de 100Km percorridos: R$0,10 por Km -
 *  
 *  Carros de luxo (aluguel de R$150 por dia) - Até 200Km percorridos:
 * R$0,30 por Km - Acima de 200Km percorridos: R$0,25 por Km
 * 
 */
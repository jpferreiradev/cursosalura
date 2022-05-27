package listadeatividades1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade16 {
	public static void main(String args[]) {
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");
		
		
		Scanner dia = new Scanner(System.in);

		int quantidadeDeCigarrosDia;
		System.out.println("Informe a quantidade de cigarros fumados por dia:");
		quantidadeDeCigarrosDia= dia.nextInt();
		System.out.println("São fumados " + quantidadeDeCigarrosDia+ " cigarros por dia.");
		
		int quantidadeDeAnos;
		System.out.println("Informe a quantidade de anos que você fomou: ");
		quantidadeDeAnos = dia.nextInt();
		System.out.println("Você fumou " + quantidadeDeAnos + " anos de cigarros.");
		
		
		double quantidadeDeMinPerdidocigarro = 10;
		
		double conversaoMinHr = quantidadeDeMinPerdidocigarro / 60;
		System.out.println(df.format(conversaoMinHr));
		System.out.println(conversaoMinHr);
		
		
		System.out.println("Você perdi " + (df.format (conversaoMinHr) + " horas por cigarro fumado"));
		System.out.println("Você perdi " + conversaoMinHr + " horas por cigarro fumado");
		
		 int valorHoraDia = 24;
		 double quantidadeDeDiasCigarro = conversaoMinHr / valorHoraDia  ;
		 double	quantidadeDeDiasPerdidosCigarro = quantidadeDeCigarrosDia * quantidadeDeDiasCigarro ;
		 
		 System.out.println("Você perdi " + (df.format(quantidadeDeDiasPerdidosCigarro) + " dias de vida a cada cigarro fumado."));
		 System.out.println("Você perdi " + quantidadeDeDiasPerdidosCigarro+ " dias de vida a cada cigarro fumado.");
		 
		 
	}
	
}

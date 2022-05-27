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
		System.out.println("S�o fumados " + quantidadeDeCigarrosDia+ " cigarros por dia.");
		
		int quantidadeDeAnos;
		System.out.println("Informe a quantidade de anos que voc� fomou: ");
		quantidadeDeAnos = dia.nextInt();
		System.out.println("Voc� fumou " + quantidadeDeAnos + " anos de cigarros.");
		
		
		double quantidadeDeMinPerdidocigarro = 10;
		
		double conversaoMinHr = quantidadeDeMinPerdidocigarro / 60;
		System.out.println(df.format(conversaoMinHr));
		System.out.println(conversaoMinHr);
		
		
		System.out.println("Voc� perdi " + (df.format (conversaoMinHr) + " horas por cigarro fumado"));
		System.out.println("Voc� perdi " + conversaoMinHr + " horas por cigarro fumado");
		
		 int valorHoraDia = 24;
		 double quantidadeDeDiasCigarro = conversaoMinHr / valorHoraDia  ;
		 double	quantidadeDeDiasPerdidosCigarro = quantidadeDeCigarrosDia * quantidadeDeDiasCigarro ;
		 
		 System.out.println("Voc� perdi " + (df.format(quantidadeDeDiasPerdidosCigarro) + " dias de vida a cada cigarro fumado."));
		 System.out.println("Voc� perdi " + quantidadeDeDiasPerdidosCigarro+ " dias de vida a cada cigarro fumado.");
		 
		 
	}
	
}

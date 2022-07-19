
import java.text.DecimalFormat;

public class Exemplos {
	public static void main(String args[]) {

		DecimalFormat df = new DecimalFormat();

		df.applyPattern("0.00");

		double dinheiro = 0.05;
		
		int pontos = 2;
		int pontos3 = 4;
		int pontos4 = 6;
		int pontos5 = 8;	
		int pontos6 = 10;
		int pontos7 = 12;
		int pontos8 = 14;
		int pontos9 = 16;
		int pontos10 = 18;
		int pontos11 = 20;

		double conversao = dinheiro * pontos;
		double conversao1= dinheiro * pontos3;
		double conversao2= dinheiro * pontos4;
		double conversao3=dinheiro * pontos5;
		double conversao4=dinheiro * pontos6;
		double conversao5=dinheiro * pontos7;
		double conversao6=dinheiro * pontos8;
		double conversao7=dinheiro * pontos9;
		double conversao8=dinheiro * pontos10;
		double conversao9=dinheiro * pontos11;
		
		
		
		System.out.println(df.format(conversao));
		System.out.println(df.format(conversao1));
		System.out.println(df.format(conversao2));
		System.out.println(df.format(conversao3));
		System.out.println(df.format(conversao4));
		System.out.println(df.format(conversao5));
		System.out.println(df.format(conversao6));
		System.out.println(df.format(conversao7));
		System.out.println(df.format(conversao8));
		System.out.println(df.format(conversao9));
		
		
	}

}

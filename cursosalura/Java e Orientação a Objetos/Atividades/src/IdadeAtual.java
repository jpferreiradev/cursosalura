
import java.util.Scanner;

public class IdadeAtual {
	
	public static void main(String[] args) {
		
		Scanner ano = new Scanner(System.in);
		
		int anoAtual,anoAntigo,idadeAtual;
		//int idadeAtual;
		//int mesAtual,mesNasceu,mesDeVida;
		
		
		
		System.out.printf("Informe em que ano nos estamos: ");
			anoAtual = ano.nextInt();
		System.out.printf("Informe o ano antigo: ");
			anoAntigo = ano.nextInt();
		/*
		System.out.printf("Informe o mês que você nasceu: ");
			mesNasceu = ano.nextInt();
		System.out.printf("Informe o mês atual: ");
			mesAtual = ano.nextInt();
		*/
		
		idadeAtual = anoAtual - anoAntigo;
		//mesDeVida = mesAtual - mesNasceu;
		
		
		System.out.println("A sua idade atual é:" + idadeAtual + " anos");
		
	}
}




/* System.out.println("O primeiro numero" + primeiroNumero);
System.out.println("O segundo numero " + segundoNumero);
*/
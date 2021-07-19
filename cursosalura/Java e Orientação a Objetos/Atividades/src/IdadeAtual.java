
import java.util.Scanner;

public class IdadeAtual {
	
	public static void main(String[] args) {
		
		Scanner ano = new Scanner(System.in);
		
		int anoAtual,anoAntigo;
		int idadeAtual;
		
		System.out.printf("Informe em que ano nos estamos: ");
			anoAtual = ano.nextInt();
		System.out.printf("Informe o ano antigo: ");
			anoAntigo = ano.nextInt();
		
		idadeAtual = anoAtual - anoAntigo;
		
		System.out.println("A sua idade atual é:" + idadeAtual + " anos");
	}
}


/* System.out.println("O primeiro número é:" + primeiroNumero);
System.out.println("O segundo número é: " + segundoNumero);
*/
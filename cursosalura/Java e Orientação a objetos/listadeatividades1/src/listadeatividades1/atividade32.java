package listadeatividades1;

import java.util.Scanner;
import java.util.Random;

public class atividade32 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);
		Random aleatorio = new Random();

		int numeroQualquer;
		int numeroAleatorio =  aleatorio.nextInt(5 + 1);
		
		
		System.out.println("Digite um n�mero qualquer 1 at� 5");
		numeroQualquer = numero.nextInt();
		System.out.println("O digitado foi " + numeroQualquer);

		System.out.println("O n�mero sorteador foi :" + numeroAleatorio);
		
		if(numeroQualquer == numeroAleatorio) {
			System.out.println("Parab�ns voc� acertou o n�mero sorteado ");
		} else {
			System.out.println("Infelizmente voc� n�o conseguiu acertar, tente novamente");
		}
		 
	
	}
}
